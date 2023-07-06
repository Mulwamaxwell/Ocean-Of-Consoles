package com.example.oceanofconsoles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SocialActivity : AppCompatActivity() {
    lateinit var ig:ImageView
    lateinit var tw:ImageView
    lateinit var fb:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)
        ig=findViewById(R.id.imageig)
        tw=findViewById(R.id.imagetw)
        fb=findViewById(R.id.imagefb)

        ig.setOnClickListener {
            val ins = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"))
            startActivity(ins)
        }
        tw.setOnClickListener {
            val twit = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/i/flow/login?redirect_after_login=%2F"))
            startActivity(twit)
        }
        fb.setOnClickListener {
            val face = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
            startActivity(face)
        }



    }
}