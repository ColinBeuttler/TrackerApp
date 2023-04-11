package com.example.trackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.commit
import com.example.trackerapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener(this)

    }

    private fun onPhotosClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, PhotosFragment())
        }
        return true
    }

    private fun onSpottingClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, SpottingFragment())
        }
        return true
    }

    private fun onHotSpotClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, HotspotFragment())
        }
        return true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_spotting -> onSpottingClicked()
            R.id.nav_photos -> onPhotosClicked()
            R.id.nav_hotspot -> onHotSpotClicked()
            else -> false
        }

    }


}




