package com.example.trackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.addCallback
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

        onBackPressedDispatcher.addCallback(this) {
            Toast.makeText(this@MainActivity, "Saved on Back Press", Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
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




