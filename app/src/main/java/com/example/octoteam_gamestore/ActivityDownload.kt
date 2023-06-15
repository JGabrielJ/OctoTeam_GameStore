package com.example.octoteam_gamestore

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.octoteam_gamestore.databinding.ActivityDescBinding
import com.example.octoteam_gamestore.databinding.ActivityDownloadBinding
import com.google.android.material.appbar.MaterialToolbar

class ActivityDownload : AppCompatActivity() {
    private lateinit var binding: ActivityDownloadBinding
    private lateinit var titleBar: MaterialToolbar
    private lateinit var redirectButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDownloadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        titleBar = findViewById(R.id.title)
        titleBar.setNavigationOnClickListener {
            onBackPressed()
        }

        redirectButton = findViewById(R.id.redirect)
        redirectButton.setOnClickListener {
            val link = "https://play.google.com/store/apps/details?id=com.cg.cowboy"
            val uri = Uri.parse(link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}