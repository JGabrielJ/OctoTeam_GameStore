package com.example.octoteam_gamestore

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.octoteam_gamestore.databinding.ActivityDescBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class ActivityDesc : AppCompatActivity() {
    private lateinit var binding: ActivityDescBinding
    private lateinit var titleBar: MaterialToolbar
    private lateinit var buyButton: MaterialButton
    private lateinit var favoriteCheck: CheckBox

    private lateinit var instagramButton: ImageButton
    private lateinit var facebookButton: ImageButton
    private lateinit var twitterButton: ImageButton

    private lateinit var star1Button: ImageButton
    private lateinit var star2Button: ImageButton
    private lateinit var star3Button: ImageButton
    private lateinit var star4Button: ImageButton
    private lateinit var star5Button: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescBinding.inflate(layoutInflater)
        setContentView(binding.root)

        titleBar = findViewById(R.id.title)
        titleBar.setNavigationOnClickListener {
            onBackPressed()
        }

        star1Button = findViewById(R.id.star1)
        star1Button.setOnClickListener {
            star1Button.setImageResource(R.drawable.ic_star)
            star2Button.setImageResource(R.drawable.ic_star_out)
            star3Button.setImageResource(R.drawable.ic_star_out)
            star4Button.setImageResource(R.drawable.ic_star_out)
            star5Button.setImageResource(R.drawable.ic_star_out)
        }

        star2Button = findViewById(R.id.star2)
        star2Button.setOnClickListener {
            star1Button.setImageResource(R.drawable.ic_star)
            star2Button.setImageResource(R.drawable.ic_star)
            star3Button.setImageResource(R.drawable.ic_star_out)
            star4Button.setImageResource(R.drawable.ic_star_out)
            star5Button.setImageResource(R.drawable.ic_star_out)
        }

        star3Button = findViewById(R.id.star3)
        star3Button.setOnClickListener {
            star1Button.setImageResource(R.drawable.ic_star)
            star2Button.setImageResource(R.drawable.ic_star)
            star3Button.setImageResource(R.drawable.ic_star)
            star4Button.setImageResource(R.drawable.ic_star_out)
            star5Button.setImageResource(R.drawable.ic_star_out)
        }

        star4Button = findViewById(R.id.star4)
        star4Button.setOnClickListener {
            star1Button.setImageResource(R.drawable.ic_star)
            star2Button.setImageResource(R.drawable.ic_star)
            star3Button.setImageResource(R.drawable.ic_star)
            star4Button.setImageResource(R.drawable.ic_star)
            star5Button.setImageResource(R.drawable.ic_star_out)
        }

        star5Button = findViewById(R.id.star5)
        star5Button.setOnClickListener {
            star1Button.setImageResource(R.drawable.ic_star)
            star2Button.setImageResource(R.drawable.ic_star)
            star3Button.setImageResource(R.drawable.ic_star)
            star4Button.setImageResource(R.drawable.ic_star)
            star5Button.setImageResource(R.drawable.ic_star)
        }

        favoriteCheck = findViewById(R.id.favorite)
        favoriteCheck.setOnCheckedChangeListener { _, isChecked ->
            if (!isChecked) {
                favoriteCheck.setButtonDrawable(R.drawable.ic_fav_fill)
            } else {
                favoriteCheck.setButtonDrawable(R.drawable.ic_fav)
            }
        }

        buyButton = findViewById(R.id.buy_game)
        buyButton.setOnClickListener {
            val intent = Intent(this, ActivityDownload::class.java)
            startActivity(intent)
        }

        instagramButton = findViewById(R.id.instagram)
        instagramButton.setOnClickListener {
            val link = "https://www.instagram.com/"
            val uri = Uri.parse(link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        facebookButton = findViewById(R.id.facebook)
        facebookButton.setOnClickListener {
            val link = "https://pt-br.facebook.com/"
            val uri = Uri.parse(link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        twitterButton = findViewById(R.id.twitter)
        twitterButton.setOnClickListener {
            val link = "https://twitter.com/"
            val uri = Uri.parse(link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}