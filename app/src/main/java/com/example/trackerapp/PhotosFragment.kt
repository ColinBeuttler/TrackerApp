package com.example.trackerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.PhotosLayoutBinding

class PhotosFragment : Fragment() {

    private lateinit var binding: PhotosLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PhotosLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }
}