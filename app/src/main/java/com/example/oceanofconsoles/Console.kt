package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Console : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_console)
        Handler(Looper.getMainLooper()).postDelayed({
            val console= Intent(this,NintendoActivity::class.java)
            startActivity(console)
            finish()
        }, 7000)

    }
}