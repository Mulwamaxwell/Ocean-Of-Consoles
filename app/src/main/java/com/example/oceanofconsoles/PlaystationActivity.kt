package com.example.oceanofconsoles

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.ScrollView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class PlaystationActivity : AppCompatActivity() {
    lateinit var up: ScrollView
    lateinit var moved: ProgressBar
    lateinit var pone:CardView
    lateinit var ptwo:CardView
    lateinit var pthree:CardView
    lateinit var pfour:CardView
    lateinit var pfive:CardView
    lateinit var psix:CardView
    lateinit var pseven:CardView
    lateinit var peight:CardView
    lateinit var pnine:CardView
    lateinit var pten:CardView
    lateinit var peleven:CardView
    lateinit var ptwelve:CardView
    lateinit var pthirteen:CardView
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playstation)

        up=findViewById(R.id.scrollps)
        moved=findViewById(R.id.progressBarps)

        up.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            val totalScrollLength = up.getChildAt(0).height - up.height
            moved.apply {
                max= totalScrollLength
                progress=scrollY
            }
        }
        pone=findViewById(R.id.playone)
        ptwo=findViewById(R.id.playtwo)
        pthree=findViewById(R.id.playthree)
        pfour=findViewById(R.id.playfour)
        pfive=findViewById(R.id.playfive)
        psix=findViewById(R.id.playsix)
        pseven=findViewById(R.id.playseven)
        peight=findViewById(R.id.playeight)
        pnine=findViewById(R.id.playnine)
        pten=findViewById(R.id.playten)
        peleven=findViewById(R.id.playeleven)
        ptwelve=findViewById(R.id.playtwelve)
        pthirteen=findViewById(R.id.playthirteen)

        pone.setOnClickListener {
            val plone=Intent(this,PlayoneActivity::class.java)
            startActivity(plone)
        }
        ptwo.setOnClickListener {
            val pltwo=Intent(this,PlaytwoActivity::class.java)
            startActivity(pltwo)
        }
        pthree.setOnClickListener {
            val plthree=Intent(this,PlaythreeActivity::class.java)
            startActivity(plthree)
        }
        pfour.setOnClickListener {
            val plfour=Intent(this,PlayfourActivity::class.java)
            startActivity(plfour)
        }
        pfive.setOnClickListener {
            val plfive=Intent(this,PlayfiveActivity::class.java)
            startActivity(plfive)
        }
        psix.setOnClickListener {
            val plsix=Intent(this,PlaysixActivity::class.java)
            startActivity(plsix)
        }
        pseven.setOnClickListener {
            val plseven=Intent(this,PlaysevenActivity::class.java)
            startActivity(plseven)
        }
        peight.setOnClickListener {
            val pleight=Intent(this,PlayEightActivity::class.java)
            startActivity(pleight)
        }
        pnine.setOnClickListener {
            val plnine=Intent(this,PlaynineActivity::class.java)
            startActivity(plnine)
        }
        pten.setOnClickListener {
            val plten=Intent(this,PlaytenActivity::class.java)
            startActivity(plten)
        }
        peleven.setOnClickListener {
            val pleleven=Intent(this,PlayelevenActivity::class.java)
            startActivity(pleleven)
        }
        ptwelve.setOnClickListener {
            val pltwelve=Intent(this,PlaytwelveActivity::class.java)
            startActivity(pltwelve)
        }
        pthirteen.setOnClickListener {
            val plthirteen=Intent(this,PlaythirteenActivity::class.java)
            startActivity(plthirteen)
        }
    }
}