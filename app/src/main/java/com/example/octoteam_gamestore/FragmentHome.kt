package com.example.octoteam_gamestore

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.octoteam_gamestore.R.*

class FragmentHome : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layout.fragment_home, container, false)

        val game1: Button = view.findViewById(R.id.game1)
        game1.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "1")
            context.startActivity(intent)
        }

        val game2: Button = view.findViewById(R.id.game2)
        game2.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "2")
            context.startActivity(intent)
        }

        val game3: Button = view.findViewById(R.id.game3)
        game3.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "3")
            context.startActivity(intent)
        }

        val game4: Button = view.findViewById(R.id.game4)
        game4.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "4")
            context.startActivity(intent)
        }

        val game5: Button = view.findViewById(R.id.game5)
        game5.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "5")
            context.startActivity(intent)
        }

        val game6: Button = view.findViewById(R.id.game6)
        game6.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "6")
            context.startActivity(intent)
        }

        val game7: Button = view.findViewById(R.id.game7)
        game7.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "7")
            context.startActivity(intent)
        }

        val game8: Button = view.findViewById(R.id.game8)
        game8.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "8")
            context.startActivity(intent)
        }

        val game9: Button = view.findViewById(R.id.game9)
        game9.setOnClickListener {
            val context = requireActivity()
            val intent = Intent(context, ActivityDesc::class.java)
            intent.putExtra("gameID", "9")
            context.startActivity(intent)
        }

        return view
    }
}
