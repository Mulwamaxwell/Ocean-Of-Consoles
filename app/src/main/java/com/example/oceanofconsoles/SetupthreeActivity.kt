package com.example.oceanofconsoles

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class SetupthreeActivity : AppCompatActivity() {
    lateinit var spay3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setupthree)
        spay3=findViewById(R.id.setupthree)
        spay3.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("Electronic Sports Gaming Setup @100000/=")
            box.setMessage("You are about to pay for Electronic Sports Gaming Setup. Click Ok to Continue")
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