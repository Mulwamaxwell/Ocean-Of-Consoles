package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class loginActivity : AppCompatActivity() {
    lateinit var sign: Button
    lateinit var go : Button
    lateinit var  mail:EditText
    lateinit var lan : EditText
    private lateinit var auth :FirebaseAuth
    lateinit var retrive:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sign = findViewById(R.id.login)
        go = findViewById(R.id.send)
        mail = findViewById(R.id.email)
        lan = findViewById(R.id.pass1)
        auth = FirebaseAuth.getInstance()
        retrive=findViewById(R.id.forgot)

        retrive.setOnClickListener {
            val get = Intent(this, ForgotActivity::class.java)
            startActivity(get)
        }




        sign.setOnClickListener {
            val log = Intent(this, registerActivity::class.java)
            startActivity(log)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
        go.setOnClickListener {
            login()
        }
    }
    private fun login(){
        val mill = mail.text.toString()
        val show  = lan.text.toString()

        if (show.isBlank()||mill.isBlank()){
            Toast.makeText(this,"Password or Email Or both cannot be blank",Toast.LENGTH_LONG).show()
            return
        }else if ( show.isBlank()){
            Toast.makeText(this,"Password Incorrect Or Blank", Toast.LENGTH_LONG).show()
            return
        }

        auth.signInWithEmailAndPassword(mill,show).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this,"Successfully Logged In",Toast.LENGTH_LONG).show()
                val me = Intent(this,CreateProfile::class.java)
                startActivity(me)
            }
            else{
                Toast.makeText(this,"Failed To Log In.",Toast.LENGTH_LONG).show()
            }
        }
    }
}