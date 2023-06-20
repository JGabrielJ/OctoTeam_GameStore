package com.example.octoteam_gamestore.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.octoteam_gamestore.R
import com.example.octoteam_gamestore.databinding.ActivityEditProfBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ActivityEditProf : AppCompatActivity() {
    private lateinit var binding : ActivityEditProfBinding
    private lateinit var titleBar: MaterialToolbar
    private lateinit var databaseReference : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        titleBar = findViewById(R.id.title)
        titleBar.setNavigationOnClickListener {
            onBackPressed()
        }

        binding.saveProfChanges.setOnClickListener {
            val username = binding.defUsername.text.toString()
            databaseReference = FirebaseDatabase.getInstance().getReference("usuarios")

            val user = UserData(username)
            databaseReference.child("1").setValue(user).addOnSuccessListener {
                binding.defUsername.text.clear()
                Toast.makeText(this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Ih, deu ruim :/", Toast.LENGTH_SHORT).show()
            }
        }
    }
}