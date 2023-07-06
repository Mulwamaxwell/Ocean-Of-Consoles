package com.example.oceanofconsoles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.oceanofconsoles.databinding.ActivityCreateProfileBinding
import com.example.oceanofconsoles.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class CreateProfile : AppCompatActivity() {
    lateinit var creat:Button
    lateinit var sk : Button
    private lateinit var binding: ActivityCreateProfileBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference
    lateinit var mess: EditText
    lateinit var lock: EditText
    lateinit var corn: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_profile)
        creat=findViewById(R.id.createpro)
        mess=findViewById(R.id.proffname1)
        lock=findViewById(R.id.proflname1)
        corn=findViewById(R.id.profemail1)
        sk=findViewById(R.id.skip)
        auth= FirebaseAuth.getInstance()
        val uid = auth.currentUser?.uid
        binding=ActivityCreateProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        databaseReference= FirebaseDatabase.getInstance().getReference("Users")
        binding.skip.setOnClickListener {
            val hm = Intent(this,MainActivity::class.java)
            startActivity(hm)
        }

        binding.createpro.setOnClickListener {
            val firstname = binding.proffname1.text.toString()
            val lastname = binding.proflname1.text.toString()
            val email = binding.profemail1.text.toString()
            val user=User(firstname,lastname,email)
            if (uid != null){
                if (firstname.isBlank()||lastname.isBlank()||email.isBlank()) {
                    Toast.makeText(this, " All fields Are required", Toast.LENGTH_LONG).show()
                    return@setOnClickListener

                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(this, "Email Incorrect Or Do not match", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                databaseReference.child(uid).setValue(user).addOnCompleteListener {
                    if(it.isSuccessful){
                        Toast.makeText(this,"Created Successfully",Toast.LENGTH_LONG).show()
                        val take = Intent(this,MainActivity::class.java)
                        startActivity(take)
                    }
                    else{
                        Toast.makeText(this,"Something Wrong Happened!",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }


    }

}