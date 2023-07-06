package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class playstationloader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playstationloader)
        Handler(Looper.getMainLooper()).postDelayed({
            val console= Intent(this,PlaystationActivity::class.java)
            startActivity(console)
            finish()
        }, 3000)

    }
}