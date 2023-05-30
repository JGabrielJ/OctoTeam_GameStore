package com.example.octoteam_gamestore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.octoteam_gamestore.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(FragmentDesc())

        binding.navBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_nav_bar -> replaceFragment(FragmentDesc())
                R.id.fav_nav_bar -> replaceFragment(FragmentFav())
                R.id.prof_nav_bar -> replaceFragment(FragmentProf())
                else -> {}
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
