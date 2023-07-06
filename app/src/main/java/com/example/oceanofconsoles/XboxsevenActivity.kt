package com.example.oceanofconsoles

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class XboxsevenActivity : AppCompatActivity() {
    lateinit var pay7:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xboxseven)
        pay7=findViewById(R.id.xpayseven)
        pay7.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("Xbox 360X @60000/=")
            box.setMessage("You are about to pay for Xbox 360X. Click Ok to Continue")
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