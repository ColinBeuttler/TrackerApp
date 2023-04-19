package com.example.trackerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.MapViewLayoutBinding

class MapViewFragment : Fragment() {

    private lateinit var binding: MapViewLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MapViewLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }
}