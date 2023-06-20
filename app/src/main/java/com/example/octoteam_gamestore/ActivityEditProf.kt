package com.example.octoteam_gamestore

import android.app.Dialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import com.example.octoteam_gamestore.databinding.ActivityEditProfBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class ActivityEditProf : AppCompatActivity() {
    private lateinit var binding : ActivityEditProfBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var databaseReference : DatabaseReference
    private lateinit var storageReference : StorageReference
    private lateinit var imageUri : Uri
    private lateinit var dialog : Dialog
    private lateinit var uid: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val auth = FirebaseAuth.getInstance()
        uid = auth.currentUser?.uid ?: ""

        binding.saveProfChanges.setOnClickListener {
            val username = binding.defUsername.text.toString()
            databaseReference = FirebaseDatabase.getInstance().getReference("usuarios")
            val user = UserData(username)
            databaseReference.child(uid).setValue(user).addOnCompleteListener {
                if (it.isSuccessful){
                    binding.defUsername.text.clear()
                }else{

                    Toast.makeText(this@ActivityEditProf, "failed to update profile", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun uploadProfilePick() {
        imageUri = Uri.parse("android.resource://$packageName/${R.drawable.ic_profile}")
        storageReference = FirebaseStorage.getInstance().getReference("usuarios/foto de perfil")
        storageReference.putFile(imageUri).addOnSuccessListener {

            Toast.makeText(this@ActivityEditProf, "success to update image", Toast.LENGTH_SHORT).show()

        }.addOnFailureListener{

            Toast.makeText(this@ActivityEditProf, "failed to update image", Toast.LENGTH_SHORT).show()
        }
    }
    private fun showProgressBar() {
        dialog = Dialog(this@ActivityEditProf)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.activity_nian_cat_load)
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
    }
    private fun hideProgressBar(){
        dialog.dismiss()
    }
}