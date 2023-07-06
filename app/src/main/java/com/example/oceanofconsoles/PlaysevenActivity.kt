package com.example.oceanofconsoles

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class PlaysevenActivity : AppCompatActivity() {
    lateinit var plpay: Button
    lateinit var plcall: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playseven)
        plpay=findViewById(R.id.ppayseven)
        plcall=findViewById(R.id.playcallseven)
        plpay.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("Playstation Three Super Slim @25000/=")
            box.setMessage("You are about to pay for Playstation Three Super Slim. Click Ok to Continue")
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
        plcall.setOnClickListener {
            var box2 = AlertDialog.Builder(this)
            box2.setTitle("Playstation Three Super Slim Rent @12000/=")
            box2.setMessage("You are about to Rent for Playstation Super Slim. Click Ok to Continue")
            box2.setPositiveButton("Ok"){ dialog: DialogInterface, _: Int ->
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:" + "0795331020")
                startActivity(dialIntent)
            }
            box2.setNegativeButton("Cancel"){ dialog: DialogInterface, _: Int ->
                dialog.dismiss()
                finish()
            }
            box2.setOnCancelListener {
                finish()
            }
                .show()

        }

    }
}