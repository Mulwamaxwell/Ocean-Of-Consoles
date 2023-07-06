package com.example.oceanofconsoles

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class NinsevenActivity : AppCompatActivity() {
    lateinit var ntpay: Button
    lateinit var ntcall: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninseven)
        ntpay=findViewById(R.id.npayseven)
        ntcall=findViewById(R.id.ncallseven)
        ntpay.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("Nintendo Game Boy @6000/=")
            box.setMessage("You are about to pay for Nintendo Game Boy. Click Ok to Continue")
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
        ntcall.setOnClickListener {
            var box2 = AlertDialog.Builder(this)
            box2.setTitle("Nintendo Game Boy Rent @1000/=")
            box2.setMessage("You are about to Rent for Nintendo Game Boy. Click Ok to Continue")
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