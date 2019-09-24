package com.jamesnyakush.ess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jamesnyakush.ess.ui.dashboard.Dashboard
import com.jamesnyakush.ess.ui.leave.LeaveFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val navController = Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.homeFrag -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment, Dashboard.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navLeave -> {
                supportFragmentManager.beginTransaction().replace(R.id.fragment, LeaveFragment.newInstance()).commit()
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

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this,R.id.fragment),
            null
        )
    }


}
