package com.jamesnyakush.ess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.jamesnyakush.ess.ui.auth.LoginActivity
import kotlinx.android.synthetic.main.splashscreen_activity.*

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen_activity)

        supportActionBar?.hide()


        val myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition)
        logo!!.startAnimation(myanim)

        val i = Intent(this, LoginActivity::class.java)
        //Async task
        val timer = object : Thread() {
            override fun run() {
                try {
                    sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(i)
                    finish()
                }
            }
        }
        timer.start()
    }
}
