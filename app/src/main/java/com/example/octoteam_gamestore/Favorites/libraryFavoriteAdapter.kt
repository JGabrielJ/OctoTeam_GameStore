package com.example.octoteam_gamestore.Favorites

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class libraryFavoriteAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                LibraryFragment()
            }
            1 -> {
                FavoritesFragment()
            }
            else -> {
                LibraryFragment()
            }
        }
    }
}