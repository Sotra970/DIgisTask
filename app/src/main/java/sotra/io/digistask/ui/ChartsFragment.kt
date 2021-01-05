package sotra.io.digistask.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.example.github.di.Injectable
import kotlinx.android.synthetic.main.fragment_charts.*
import sotra.i.chachingdemo.api.ApiResponse
import sotra.i.chachingdemo.ui.DataViewModel
import sotra.io.digistask.R
import sotra.io.digistask.util.DynamicLineChartManager
import timber.log.Timber
import javax.inject.Inject


class ChartsFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewModel: DataViewModel


    var dynamicLineChartManager1: DynamicLineChartManager? = null
    var dynamicLineChartManager2: DynamicLineChartManager? = null
    var dynamicLineChartManager3: DynamicLineChartManager? = null
    var dynamicLineChartManager4: DynamicLineChartManager? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_charts, container, false)
    }


    @SuppressLint("CheckResult")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupChart()
        startDataObserving()
    }

    private fun setupChart() {
        dynamicLineChartManager1 = DynamicLineChartManager(
                dynamic_chart1,
                listOf("RSRP", "RSRQ", "SINR"),
                listOf(
                        Color.parseColor("#673AB7"),
                        Color.parseColor("#E91E63"),
                        Color.parseColor("#00E676")
                )
        )
        dynamicLineChartManager2 = DynamicLineChartManager(
                dynamic_chart2,
                listOf("RSRP"),
                listOf(Color.parseColor("#673AB7"))
        )
        dynamicLineChartManager3 = DynamicLineChartManager(
                dynamic_chart3,
                listOf("RSRQ"),
                listOf(Color.parseColor("#E91E63"))
        )
        dynamicLineChartManager4 = DynamicLineChartManager(
                dynamic_chart4,
                listOf("SINR"),
                listOf(Color.parseColor("#00E676"))
        )
        dynamicLineChartManager1?.setYAxis(30f, -140f, 5)
        dynamicLineChartManager2?.setYAxis(-60f, -140f, 5)
        dynamicLineChartManager3?.setYAxis(0f, -30f, 5)
        dynamicLineChartManager4?.setYAxis(30f, -10f, 5)

    }

    // getting data from random api every 2 sec
    @SuppressLint("CheckResult")
    private fun startDataObserving() {
        viewModel = ViewModelProvider(requireActivity(), viewModelFactory).get(DataViewModel::class.java)
        viewModel.newChild.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ApiResponse.Success -> {
                    val list = listOf(it.body.RSRP, it.body.RSRQ, it.body.SINR)
                    Timber.d("data list $list")
                    dynamicLineChartManager1?.addEntry(list)
                    dynamicLineChartManager2?.addEntry(list.get(0))
                    dynamicLineChartManager3?.addEntry(list.get(1))
                    dynamicLineChartManager4?.addEntry(list.get(2))
                }
            }
        })
    }
}