package com.example.oceanofconsoles

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.ScrollView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class NintendoActivity : AppCompatActivity() {
    lateinit var up1: ScrollView
    lateinit var moved1: ProgressBar
    lateinit var nin1:CardView
    lateinit var nin2:CardView
    lateinit var nin3:CardView
    lateinit var nin4:CardView
    lateinit var nin5:CardView
    lateinit var nin6:CardView
    lateinit var nin7:CardView
    lateinit var nin8:CardView
    lateinit var nin9:CardView
    lateinit var nin10:CardView
    lateinit var nin11:CardView
    lateinit var nin12:CardView
    lateinit var nin13:CardView
    lateinit var nin14:CardView
    lateinit var nin15:CardView
    lateinit var nin16:CardView
    lateinit var nin17:CardView
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nintendo)

        up1=findViewById(R.id.scrollnin)
        moved1=findViewById(R.id.progressBarnin)
        nin1=findViewById(R.id.nin001)
        nin2=findViewById(R.id.nin002)
        nin3=findViewById(R.id.nin003)
        nin4=findViewById(R.id.nin004)
        nin5=findViewById(R.id.nin005)
        nin6=findViewById(R.id.nin006)
        nin7=findViewById(R.id.nin007)
        nin8=findViewById(R.id.nin008)
        nin9=findViewById(R.id.nin009)
        nin10=findViewById(R.id.nin010)
        nin11=findViewById(R.id.nin011)
        nin12=findViewById(R.id.nin012)
        nin13=findViewById(R.id.nin013)
        nin14=findViewById(R.id.nin014)
        nin15=findViewById(R.id.nin015)
        nin16=findViewById(R.id.nin016)

        up1.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            val totalScrollLength = up1.getChildAt(0).height - up1.height
            moved1.apply {
                max= totalScrollLength
                progress=scrollY
            }
        }
        nin1.setOnClickListener {
            val nen1=Intent(this,NinoneActivity::class.java)
            startActivity(nen1)
        }
        nin2.setOnClickListener {
            val nen2=Intent(this,NintwoActivity::class.java)
            startActivity(nen2)
        }
        nin3.setOnClickListener {
            val nen3=Intent(this,NinthreeActivity::class.java)
            startActivity(nen3)
        }
        nin4.setOnClickListener {
            val nen4=Intent(this,NinfourActivity::class.java)
            startActivity(nen4)
        }
        nin5.setOnClickListener {
            val nen5=Intent(this,NinfiveActivity::class.java)
            startActivity(nen5)
        }
        nin6.setOnClickListener {
            val nen6=Intent(this,NinsixActivity::class.java)
            startActivity(nen6)
        }
        nin7.setOnClickListener {
            val nen7=Intent(this,NinsevenActivity::class.java)
            startActivity(nen7)
        }
        nin8.setOnClickListener {
            val nen8=Intent(this,NineightActivity::class.java)
            startActivity(nen8)
        }
        nin9.setOnClickListener {
            val nen9=Intent(this,NinnineActivity::class.java)
            startActivity(nen9)
        }
        nin10.setOnClickListener {
            val nen10=Intent(this,NintenActivity::class.java)
            startActivity(nen10)
        }
        nin11.setOnClickListener {
            val nen11=Intent(this,NinelevenActivity::class.java)
            startActivity(nen11)
        }
        nin12.setOnClickListener {
            val nen12=Intent(this,NintwelveActivity::class.java)
            startActivity(nen12)
        }
        nin13.setOnClickListener {
            val nen1=Intent(this,NinthirteenActivity::class.java)
            startActivity(nen1)
        }
        nin14.setOnClickListener {
            val nen14=Intent(this,NinfifteenActivity::class.java)
            startActivity(nen14)
        }
        nin15.setOnClickListener {
            val nen15=Intent(this,NinsixteenActivity::class.java)
            startActivity(nen15)
        }
        nin16.setOnClickListener {
            val nen1=Intent(this,NinseventeenActivity::class.java)
            startActivity(nen1)
        }

    }
}