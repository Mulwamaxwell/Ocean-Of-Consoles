package com.example.oceanofconsoles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.oceanofconsoles.databinding.ActivityCreateProfileBinding
import com.example.oceanofconsoles.databinding.ActivityDeleteprofileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DeleteprofileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDeleteprofileBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference
    private lateinit var uid : String
    lateinit var deleteemail:EditText
    lateinit var deletecom:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deleteprofile)

        deleteemail=findViewById(R.id.delmail)
        deletecom=findViewById(R.id.delete)
        auth = FirebaseAuth.getInstance()
        uid = auth.currentUser?.uid.toString()

        binding= ActivityDeleteprofileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.delete.setOnClickListener {
            var email=binding.delmail.text.toString()
            if (email.isNotEmpty()) {
                deleteuser(uid)
                val deleted=Intent(this,MainActivity::class.java)
                startActivity(deleted)
            }
            else{
                Toast.makeText(this,"Please Enter your Email",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun deleteuser(uid: String) {
        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(uid).removeValue().addOnSuccessListener {
            binding.delmail.text.clear()
            Toast.makeText(this,"Successfully Deleted",Toast.LENGTH_SHORT).show()
        }
            .addOnFailureListener{
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }

    }
}