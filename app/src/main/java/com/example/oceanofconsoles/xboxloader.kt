package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class xboxloader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xboxloader)
        Handler(Looper.getMainLooper()).postDelayed({
            val console= Intent(this,XboxActivity::class.java)
            startActivity(console)
            finish()
        }, 5000)

    }
}