package com.example.oceanofconsoles

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class SettingActivity : AppCompatActivity() {
    lateinit var call1:CardView
    lateinit var social1:CardView
    lateinit var del1:CardView
    lateinit var log1:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        social1=findViewById(R.id.social)
        call1=findViewById(R.id.contact)
        log1=findViewById(R.id.goout)
        del1=findViewById(R.id.delete)

        social1.setOnClickListener {
            val c1=Intent(this,SocialActivity::class.java)
            startActivity(c1)
        }
        call1.setOnClickListener {
            var box2 = AlertDialog.Builder(this)
            box2.setTitle("Ocean Of Consoles")
            box2.setMessage("You are about to Contact Customer Care. Click Ok to Continue")
            box2.setPositiveButton("Ok"){ dialog: DialogInterface, _: Int ->
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:" + "0795331020")
                startActivity(dialIntent)
            }
            box2.setNegativeButton("Cancel"){ dialog: DialogInterface, _: Int ->
                dialog.dismiss()
            }
            box2.setOnCancelListener {
                finish()
            }
                .show()

        }
        log1.setOnClickListener {
            var box= AlertDialog.Builder(this)
            box.setTitle("Ocean Of Consoles")
            box.setMessage("Do you want to Logout?")
            box.setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, id ->
                val lod=Intent(this,loginActivity::class.java)
                startActivity(lod)

            })
            box.setNegativeButton("Cancel",
                DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })
            var alert=box.create()
            alert.show()
        }
        del1.setOnClickListener {
            val delette=Intent(this,DeleteprofileActivity::class.java)
            startActivity(delette)
        }
    }
}