package com.example.octoteam_gamestore

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.octoteam_gamestore.Profile.ActivityEditProf

class FragmentProf : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_prof, container, false)

        val editProfbtn : Button = view.findViewById(R.id.editProfbtn)
        editProfbtn.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityEditProf::class.java)
            context.startActivity(intent)
        }

        return view
    }
}