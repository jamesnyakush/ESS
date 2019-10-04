package com.jamesnyakush.ess.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamesnyakush.ess.MainActivity
import com.jamesnyakush.ess.R
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        login.setOnClickListener {
           startActivity(Intent(LoginActivity@this,MainActivity::class.java))
        }
    }
}
