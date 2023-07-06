package com.example.oceanofconsoles

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class PconeActivity : AppCompatActivity() {
    lateinit var pcpay:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pcone)
        pcpay=findViewById(R.id.pcpay1)
        pcpay.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("Ryzen MIDI Gaming PC @120000/=")
            box.setMessage("You are about to pay for Ryzen MIDI Gaming PC. Click Ok to Continue")
            box.setPositiveButton("Ok"){ dialog: DialogInterface, _: Int ->
                val wire=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                startActivity(wire)
            }
            box.setNegativeButton("Cancel"){ dialog: DialogInterface, _: Int ->
                dialog.dismiss()
                finish()
            }
            box.setOnCancelListener {
                finish()
            }
                .show()

        }
    }
}