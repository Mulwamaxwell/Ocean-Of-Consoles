package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    lateinit var close: TextView
    lateinit var Xbox:CardView
    lateinit var ps:CardView
    lateinit var sett:CardView
    lateinit var vr:CardView
    lateinit var gamer:CardView
    lateinit var nano:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        close=findViewById(R.id.back)
        Xbox=findViewById(R.id.xbox)
        ps=findViewById(R.id.playst)
        nano=findViewById(R.id.nintendo)
        sett=findViewById(R.id.setup)
        gamer=findViewById(R.id.gaming)
        vr=findViewById(R.id.vreality)

        close.setOnClickListener {
            val out=Intent(this,MainActivity::class.java)
            startActivity(out)
            finish()
        }
        Xbox.setOnClickListener {
            val box=Intent(this,xboxloader::class.java)
            startActivity(box)
        }
        nano.setOnClickListener {
            val nan = Intent(this,Console::class.java)
            startActivity(nan)
        }
        ps.setOnClickListener {
            val play = Intent(this,playstationloader::class.java)
            startActivity(play)
        }
        vr.setOnClickListener {
            val reality = Intent(this,vrloader::class.java)
            startActivity(reality)
        }
        sett.setOnClickListener {
            val up = Intent(this,setuploader::class.java)
            startActivity(up)
        }
        gamer.setOnClickListener {
            val pc = Intent(this,gamepcloader::class.java)
            startActivity(pc)
        }



    }
}