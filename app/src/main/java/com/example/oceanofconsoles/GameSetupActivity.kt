package com.example.oceanofconsoles

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.ScrollView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.core.graphics.toColor

class GameSetupActivity : AppCompatActivity() {
    lateinit var down:ScrollView
    lateinit var move:ProgressBar
    lateinit var s1:CardView
    lateinit var s2:CardView
    lateinit var s3:CardView
    lateinit var s4:CardView
    lateinit var s5:CardView
    lateinit var s6:CardView
    lateinit var s7:CardView
    lateinit var s8:CardView
    lateinit var s9:CardView
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_setup)

        down=findViewById(R.id.scroll)
        move=findViewById(R.id.progressBarpc)
        s1=findViewById(R.id.setuponne)
        s2=findViewById(R.id.setupttwo)
        s3=findViewById(R.id.setup3)
        s4=findViewById(R.id.setupffour)
        s5=findViewById(R.id.setupffive)
        s6=findViewById(R.id.setupssix)
        s7=findViewById(R.id.setupsseven)
        s8=findViewById(R.id.setupeeight)
        s9=findViewById(R.id.setupnnine)

        down.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            val totalScrollLength = down.getChildAt(0).height - down.height
            move.apply {
                max= totalScrollLength
                progress=scrollY
            }
        }
        s1.setOnClickListener {
            val stone=Intent(this,SetuponeActivity::class.java)
            startActivity(stone)
        }
        s2.setOnClickListener {
            val sttwo=Intent(this,SetuptwoActivity::class.java)
            startActivity(sttwo)
        }
        s3.setOnClickListener {
            val stthree=Intent(this,SetupthreeActivity::class.java)
            startActivity(stthree)
        }
        s4.setOnClickListener {
            val stfour=Intent(this,SetupfourActivity::class.java)
            startActivity(stfour)
        }
        s5.setOnClickListener {
            val stfive=Intent(this,SetupfiveActivity::class.java)
            startActivity(stfive)
        }
        s6.setOnClickListener {
            val stsix=Intent(this,SetupsixActivity::class.java)
            startActivity(stsix)
        }
        s7.setOnClickListener {
            val stseven=Intent(this,SetupsevenActivity::class.java)
            startActivity(stseven)
        }
        s8.setOnClickListener {
            val steight=Intent(this,SetupeightActivity::class.java)
            startActivity(steight)
        }
        s9.setOnClickListener {
            val stnine=Intent(this,SetupnineActivity::class.java)
            startActivity(stnine)
        }
    }
}