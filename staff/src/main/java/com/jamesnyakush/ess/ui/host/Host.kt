package com.jamesnyakush.ess.ui.host


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.jamesnyakush.ess.R
import com.jamesnyakush.ess.ui.dashboard.Dashboard
import com.jamesnyakush.ess.ui.leave.LeaveFragment
import kotlinx.android.synthetic.main.host_fragment.*


class Host : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.host_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.homeFrag -> {
//                supportFragmentManager.beginTransaction().replace(R.id.fragment, Dashboard.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navLeave -> {
//                supportFragmentManager.beginTransaction().replace(R.id.fragment, LeaveFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navTraining -> {
                return@OnNavigationItemSelectedListener true
            }
            else -> {
                return@OnNavigationItemSelectedListener false
            }
        }
    }
}
