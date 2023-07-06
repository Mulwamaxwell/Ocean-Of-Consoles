package com.example.oceanofconsoles

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class SetupfourActivity : AppCompatActivity() {
    lateinit var spay4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setupfour)
        spay4=findViewById(R.id.setupfour)
        spay4.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("Epic Fortnite Gaming Setup @280000/=")
            box.setMessage("You are about to pay for Epic Fortnite Gaming Setup. Click Ok to Continue")
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