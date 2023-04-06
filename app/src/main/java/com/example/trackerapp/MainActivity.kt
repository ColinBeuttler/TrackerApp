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

    private fun onPhotosClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, PhotosFragment())
        }
    }

    private fun onSpottingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, SpottingFragment())
        }
    }

    private fun onHotSpotClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, HotspotFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.nav_spotting) {
            onSpottingClicked()
            return true
        } else if (item.itemId == R.id.nav_hotspot) {
            onHotSpotClicked()
            return true
        } else if (item.itemId == R.id.nav_photos) {
            onPhotosClicked()
            return true
        } else {
            return false
        }
    }


}




