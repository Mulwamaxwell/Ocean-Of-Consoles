package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class vrloader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vrloader)
        Handler(Looper.getMainLooper()).postDelayed({
            val console= Intent(this,VirtualActivity::class.java)
            startActivity(console)
            finish()
        }, 3000)

    }
}