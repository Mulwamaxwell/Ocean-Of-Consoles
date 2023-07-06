package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.oceanofconsoles.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class registerActivity : AppCompatActivity() {
    lateinit var sign:Button
    lateinit var take:Button
    lateinit var username:EditText
    lateinit var mess:EditText
    lateinit var lock:EditText
    lateinit var corn:EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        sign=findViewById(R.id.signup)
        take=findViewById(R.id.sign2)
        mess=findViewById(R.id.mail2)
        lock=findViewById(R.id.pass2)
        username=findViewById(R.id.uname)
        corn=findViewById(R.id.confirm)
        auth=Firebase.auth
        sign.setOnClickListener {
            val up = Intent(this,loginActivity::class.java)
            startActivity(up)
            overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
        }
        take.setOnClickListener {
            signupuser()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)

    }
    private fun signupuser(){
        val con=username.text.toString()
        val ema = mess.text.toString()
        val key = lock.text.toString()
        val conpass= corn.text.toString()

        if (ema.isBlank()||key.isBlank()||conpass.isBlank()||con.isBlank()){
            Toast.makeText(this,"Username,Password or Email Or none of them can be blank",Toast.LENGTH_LONG).show()
            return
        }
        else if (key != conpass){
            Toast.makeText(this,"Password Do Not Match", Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(ema,key).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this,"Signed Up Successfully",Toast.LENGTH_LONG).show()
                val logo = Intent(this,loginActivity::class.java)
                startActivity(logo)
            }
            else{
                Toast.makeText(this,"Sign Up Failed",Toast.LENGTH_LONG).show()
            }
        }
    }

}