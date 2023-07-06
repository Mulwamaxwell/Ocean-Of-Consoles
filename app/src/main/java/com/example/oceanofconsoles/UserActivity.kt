package com.example.oceanofconsoles

import android.content.DialogInterface
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.oceanofconsoles.databinding.ActivityUserBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.collection.LLRBNode.Color
import com.google.firebase.storage.StorageReference

class UserActivity : AppCompatActivity() {
    private lateinit var binding:ActivityUserBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference
    private lateinit var user:User
    private lateinit var uid : String
    lateinit var give:Button
    lateinit var ppname:TextView
    lateinit var ppmail:TextView
    lateinit var pppass:TextView
    private lateinit var upl:ImageView
    private lateinit var myimage:FloatingActionButton
    companion object{
        val imagecode=100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        binding= ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        upl=findViewById(R.id.circleImageView)
        myimage=findViewById(R.id.floatingActionButton)
        give=findViewById(R.id.confirmup)
        ppname=findViewById(R.id.pfname)
        ppmail=findViewById(R.id.plname)
        pppass=findViewById(R.id.ppemail)

        myimage.setOnClickListener {
            pickimage()
        }

        auth = FirebaseAuth.getInstance()
        uid = auth.currentUser?.uid.toString()
        databaseReference =  FirebaseDatabase.getInstance().getReference("Users")
        binding.confirmup.setOnClickListener {
            val reck=Intent(this,ProfileActivity::class.java)
            startActivity(reck)
        }
        if (uid.isNotEmpty()){
            getUserData()

        }
    }

    private fun pickimage() {
        val pick = Intent(Intent.ACTION_PICK)
        pick.type="image/"
        startActivityForResult(pick, imagecode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        upl.setImageURI(data?.data)
    }

    private fun getUserData() {
        databaseReference.child(uid).addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                user = snapshot.getValue(User::class.java)!!
                binding.pfname.setText(user.firstname)
                binding.plname.setText(user.lastname)
                binding.ppemail.setText(user.email)

            }

            override fun onCancelled(error: DatabaseError) {
            }

        })
    }
}