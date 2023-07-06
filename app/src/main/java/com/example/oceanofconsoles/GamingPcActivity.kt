package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class GamingPcActivity : AppCompatActivity() {
    lateinit var pc1:CardView
    lateinit var pc2:CardView
    lateinit var pc3:CardView
    lateinit var pc4:CardView
    lateinit var pc5:CardView
    lateinit var pc6:CardView
    lateinit var pc7:CardView
    lateinit var pc8:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming_pc)
        pc1=findViewById(R.id.pc0ne)
        pc2=findViewById(R.id.pctwo)
        pc3=findViewById(R.id.pcthree)
        pc4=findViewById(R.id.pcfour)
        pc5=findViewById(R.id.pcfive)
        pc6=findViewById(R.id.pcsix)
        pc7=findViewById(R.id.pcseven)
        pc8=findViewById(R.id.pceight)

        pc1.setOnClickListener {
            val cp1=Intent(this,PconeActivity::class.java)
            startActivity(cp1)
        }
        pc2.setOnClickListener {
            val cp2=Intent(this,PctwoActivity::class.java)
            startActivity(cp2)
        }
        pc3.setOnClickListener {
            val cp3=Intent(this,PcthreeActivity::class.java)
            startActivity(cp3)
        }
        pc4.setOnClickListener {
            val cp4=Intent(this,PcfourActivity::class.java)
            startActivity(cp4)
        }
        pc5.setOnClickListener {
            val cp5=Intent(this,PcfiveActivity::class.java)
            startActivity(cp5)
        }
        pc6.setOnClickListener {
            val cp6=Intent(this,PcsixActivity::class.java)
            startActivity(cp6)
        }
        pc7.setOnClickListener {
            val cp7=Intent(this,PcsevenActivity::class.java)
            startActivity(cp7)
        }
        pc8.setOnClickListener {
            val cp8=Intent(this,PceightActivity::class.java)
            startActivity(cp8)
        }
    }
}