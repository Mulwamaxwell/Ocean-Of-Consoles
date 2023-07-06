package com.example.oceanofconsoles

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class PcsixActivity : AppCompatActivity() {
    lateinit var pcpay: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pcsix)
        pcpay=findViewById(R.id.pcpay6)
        pcpay.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setTitle("NZXT Player Gaming PC @170000/=")
            box.setMessage("You are about to pay for NZXT Player Gaming PC. Click Ok to Continue")
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