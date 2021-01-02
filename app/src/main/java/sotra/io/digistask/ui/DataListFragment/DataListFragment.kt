package sotra.io.digistask.ui.DataListFragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.example.github.di.Injectable
import kotlinx.android.synthetic.main.fragment_list.*
import sotra.i.chachingdemo.api.ApiResponse
import sotra.i.chachingdemo.ui.DataViewModel
import sotra.io.digistask.R
import javax.inject.Inject

class DataListFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewModel: DataViewModel

    private val dataListAdapter = DataListAdapter()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        startDataObserving()
    }

    private fun setupAdapter() {
        recycler.adapter = dataListAdapter
        recycler.layoutManager = LinearLayoutManager(this.context)
    }

    // getting data from random api every 2 sec
    @SuppressLint("CheckResult")
    private fun startDataObserving() {
        viewModel = ViewModelProvider(requireActivity(), viewModelFactory).get(DataViewModel::class.java)
        viewModel.newChild.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ApiResponse.Success -> {
                    dataListAdapter.setData(it.body)
                }
            }
        })
    }
}