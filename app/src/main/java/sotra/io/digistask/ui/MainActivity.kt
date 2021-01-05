package sotra.i.chachingdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.no_internet_layout.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import sotra.i.chachingdemo.api.ApiResponse
import sotra.i.chachingdemo.ui.DataViewModel
import sotra.io.digistask.R
import sotra.io.digistask.ui.ChartsFragment
import sotra.io.digistask.ui.DataListFragment.DataListFragment
import sotra.io.digistask.util.ViewPagerAdapter
import javax.inject.Inject
import kotlin.concurrent.fixedRateTimer


class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewModel: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startListing()
        setupPager()
        getDataEvery2Sec(savedInstanceState)
    }

    private fun setupPager() {
        viewPager.adapter = ViewPagerAdapter(this, listOf(
                DataListFragment(), ChartsFragment()
        ))
        TabLayoutMediator(tabLayout, viewPager, false, true, TabLayoutMediator.TabConfigurationStrategy { t, p ->
            when (p) {
                0 -> t.setIcon(R.drawable.lis_icon)
                1 -> t.setIcon(R.drawable.chart_icon)
            }
        }).attach()
        viewPager.offscreenPageLimit = 2
    }

    private fun startListing() {
        viewModel = ViewModelProvider(this, viewModelFactory).get(DataViewModel::class.java)
        viewModel.newChild.observe(this, Observer {
            if (it is ApiResponse.NetworkError) {
                if (no_internet_layout.visibility == View.GONE)
                    no_internet_layout.visibility = View.VISIBLE
            } else if (no_internet_layout.visibility == View.VISIBLE)
                no_internet_layout.visibility = View.GONE
        })
    }


    @SuppressLint("CheckResult")
    private fun getDataEvery2Sec(savedInstanceState: Bundle?) {
        if (savedInstanceState == null)
            GlobalScope.launch {
                fixedRateTimer(period = 2000L) {
                    viewModel.fetchNewData()
                }
            }
    }


    override fun supportFragmentInjector() = dispatchingAndroidInjector


}