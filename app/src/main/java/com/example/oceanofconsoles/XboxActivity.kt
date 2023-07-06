package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class XboxActivity : AppCompatActivity() {
    lateinit var one:CardView
    lateinit var two:CardView
    lateinit var three:CardView
    lateinit var four:CardView
    lateinit var five:CardView
    lateinit var six:CardView
    lateinit var seven:CardView
    lateinit var eight:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xbox)

        one=findViewById(R.id.xbox0ne)
        two=findViewById(R.id.xboxtwo)
        three=findViewById(R.id.xboxthree)
        four=findViewById(R.id.xboxfour)
        five=findViewById(R.id.xboxfive)
        six=findViewById(R.id.xboxsix)
        seven=findViewById(R.id.xboxseven)
        eight=findViewById(R.id.xboxeight)

        one.setOnClickListener {
            val xone=Intent(this,XboxoneActivity::class.java)
            startActivity(xone)
        }
        two.setOnClickListener {
            val xtwo=Intent(this,XboxtwoActivity::class.java)
            startActivity(xtwo)
        }
        three.setOnClickListener {
            val xthree=Intent(this,XboxthreeActivity::class.java)
            startActivity(xthree)
        }
        four.setOnClickListener {
            val xfour=Intent(this,XboxfourActivity::class.java)
            startActivity(xfour)
        }
        five.setOnClickListener {
            val xfive=Intent(this,XboxfiveActivity::class.java)
            startActivity(xfive)
        }
        six.setOnClickListener {
            val xsix=Intent(this,XboxsixActivity::class.java)
            startActivity(xsix)
        }
        seven.setOnClickListener {
            val xseven=Intent(this,XboxsevenActivity::class.java)
            startActivity(xseven)
        }
        eight.setOnClickListener {
            val xeight=Intent(this,XboxeightActivity::class.java)
            startActivity(xeight)
        }







    }
}