package com.example.octoteam_gamestore

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.button.MaterialButton

class FragmentHome : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val descButton: MaterialButton = view.findViewById(R.id.change_frag)
        descButton.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            context.startActivity(intent)
        }

        return view
    }
}
