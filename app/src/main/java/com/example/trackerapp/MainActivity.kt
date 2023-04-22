package com.example.trackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
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

        onBackPressedDispatcher.addCallback(this) { showDialog() }
    }


    private fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("Warning!!")
            .setMessage("All unsaved data will be deleted, continue?")
            .setPositiveButton("Confirm") { _, _ -> finish() }
            .setNegativeButton("Back") { dialog, _ -> dialog.dismiss() }
            .show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }


    private fun onMapViewClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, MapViewFragment())
        }
        return true
    }

    private fun onPostViewClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, PostViewFragment())
        }
        return true
    }

    private fun onAddNewPostClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, AddNewPostFragment())
        }
        return true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.nav_map_view -> onMapViewClicked()
            R.id.nav_post_view -> onPostViewClicked()
            R.id.nav_new_post -> onAddNewPostClicked()
            else -> false
        }

    }


}




