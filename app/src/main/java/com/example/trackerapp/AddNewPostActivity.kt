package com.example.trackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trackerapp.databinding.ActivityAddNewPostBinding

class AddNewPostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNewPostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}