package com.example.octoteam_gamestore.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.octoteam_gamestore.R

class NianCatLoad : AppCompatActivity() {
    private lateinit var imageView : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nian_cat_load)

        imageView = findViewById(R.id.nian_cat_load)

    }
}