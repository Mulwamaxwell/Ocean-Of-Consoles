package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.oceanofconsoles.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding:ActivityProfileBinding
    private lateinit var database:DatabaseReference
    private lateinit var uid : String
    private lateinit var auth: FirebaseAuth
    lateinit var edit:Button
    lateinit var edfname:EditText
    lateinit var edlname:EditText
    lateinit var edemail:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        auth = FirebaseAuth.getInstance()
        uid = auth.currentUser?.uid.toString()

        edit=findViewById(R.id.update)
        edfname=findViewById(R.id.upfname)
        edlname=findViewById(R.id.uplname)
        edemail=findViewById(R.id.upmail)

        binding= ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.update.setOnClickListener {
            val firstname = binding.upfname.text.toString()
            val lastname = binding.uplname.text.toString()
            val email = binding.upmail.text.toString()

            updatedata(firstname,lastname,email)
        }

    }

    private fun updatedata(firstname: String, lastname: String, email: String) {

        database=FirebaseDatabase.getInstance().getReference("Users")
        val user = mapOf<String,String>(
            "firstname" to firstname,
            "lastname"  to lastname,
            "email" to email

        )
        database.child(uid).updateChildren(user).addOnSuccessListener {
            binding.upfname.text.clear()
            binding.uplname.text.clear()
            binding.upmail.text.clear()
            Toast.makeText(this,"Successfully Updated",Toast.LENGTH_SHORT).show()
            val deck= Intent(this,UserActivity::class.java)
            startActivity(deck)
        }.addOnFailureListener{
            Toast.makeText(this,"Failed to Updated",Toast.LENGTH_SHORT).show()
        }
    }
}