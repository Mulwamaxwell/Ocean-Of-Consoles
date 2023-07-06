package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class VirtualActivity : AppCompatActivity() {
    lateinit var vr1:CardView
    lateinit var vr2:CardView
    lateinit var vr3:CardView
    lateinit var vr4:CardView
    lateinit var vr5:CardView
    lateinit var vr6:CardView
    lateinit var vr7:CardView
    lateinit var vr8:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virtual)
        vr1=findViewById(R.id.vroone)
        vr2=findViewById(R.id.vrtwo)
        vr3=findViewById(R.id.vrthree)
        vr4=findViewById(R.id.vrfour)
        vr5=findViewById(R.id.vrfive)
        vr6=findViewById(R.id.vrsix)
        vr7=findViewById(R.id.vrseven)
        vr8=findViewById(R.id.vreight)

        vr1.setOnClickListener {
            val r1=Intent(this,VroneActivity::class.java)
            startActivity(r1)
        }
        vr2.setOnClickListener {
            val r2=Intent(this,VrtwoActivity::class.java)
            startActivity(r2)
        }
        vr3.setOnClickListener {
            val r3=Intent(this,VrthreeActivity::class.java)
            startActivity(r3)
        }
        vr4.setOnClickListener {
            val r4=Intent(this,VrfourActivity::class.java)
            startActivity(r4)
        }
        vr5.setOnClickListener {
            val r5=Intent(this,VrfiveActivity::class.java)
            startActivity(r5)
        }
        vr6.setOnClickListener {
            val r6=Intent(this,VrsixActivity::class.java)
            startActivity(r6)
        }
        vr7.setOnClickListener {
            val r7=Intent(this,VrsevenActivity::class.java)
            startActivity(r7)
        }
        vr8.setOnClickListener {
            val r8=Intent(this,VreightActivity::class.java)
            startActivity(r8)
        }

    }
}