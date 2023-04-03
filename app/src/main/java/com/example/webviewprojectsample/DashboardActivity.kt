package com.example.webviewprojectsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        Handler().postDelayed({

            val intent =  Intent( this,MainActivity::class.java)
            startActivity(intent)
            finish()


        }, 1000 )



    }
}