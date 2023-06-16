package com.example.octoteam_gamestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.octoteam_gamestore.Favorites.libraryFavoriteAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FragmentFav : Fragment() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: libraryFavoriteAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_fav, container, false)

        tabLayout = view.findViewById(R.id.tab)
        viewPager2 = view.findViewById(R.id.viewpager)

        adapter = libraryFavoriteAdapter(childFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position->
            when (position) {
                0 -> {
                    tab.text = "Biblioteca"
                }
                1 -> {
                    tab.text = "Favoritos"
                }
            }
        }.attach()

        return view
    }
}