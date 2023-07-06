package com.example.oceanofconsoles

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class MainActivity : AppCompatActivity() {
    lateinit var open1:CardView
    lateinit var open2:CardView
    lateinit var open3:CardView
    lateinit var close:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open1=findViewById(R.id.user)
        open2=findViewById(R.id.dash)
        open3=findViewById(R.id.setting)
        close=findViewById(R.id.Close)

        open1.setOnClickListener {
            val profile=Intent(this,UserActivity::class.java)
            startActivity(profile)
            Toast.makeText(this,"You Are In Profile Section.",Toast.LENGTH_LONG).show()
        }
        open2.setOnClickListener {
            val board = Intent(this,DashboardActivity::class.java)
            startActivity(board)
            Toast.makeText(this,"You Are In the Dashboard Section.",Toast.LENGTH_LONG).show()
        }
        open3.setOnClickListener {
            val set = Intent(this,SettingActivity::class.java)
            startActivity(set)
            Toast.makeText(this,"You Are In the Settings Section.",Toast.LENGTH_LONG).show()
        }
        close.setOnClickListener {
            var box= AlertDialog.Builder(this)
            box.setTitle("Ocean Of Consoles")
            box.setMessage("Do you want to Logout?")
            box.setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, id ->
                val out= Intent(this,loginActivity::class.java)
                startActivity(out)
                Toast.makeText(this,"You Just logged out.",Toast.LENGTH_SHORT).show()
                finish()})
            box.setNegativeButton("Cancel",
                DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })
            var alert=box.create()
            alert.show()
        }
    }
}