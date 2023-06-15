package com.example.octoteam_gamestore

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.octoteam_gamestore.databinding.ActivityMainBinding
import com.google.android.material.appbar.MaterialToolbar

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var titleBar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(FragmentHome())
        binding.navBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_nav_bar -> replaceFragment(FragmentHome())
                R.id.fav_nav_bar -> replaceFragment(FragmentFav())
                R.id.prof_nav_bar -> replaceFragment(FragmentProf())
                else -> {}
            }

            true
        }

        titleBar = findViewById(R.id.title)
        titleBar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.exit_title_bar -> {
                    finish()
                    true
                }

                else -> {
                    false
                }
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
