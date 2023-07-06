package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    lateinit var lan:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        lan=findViewById(R.id.home)

        lan.setOnClickListener {
            val take= Intent(this,MainActivity::class.java)
            startActivity(take)
        }
    }
}