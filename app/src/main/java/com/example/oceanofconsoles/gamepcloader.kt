package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class gamepcloader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamepcloader)
        Handler(Looper.getMainLooper()).postDelayed({
            val console= Intent(this,GamingPcActivity::class.java)
            startActivity(console)
            finish()
        }, 4000)

    }
}