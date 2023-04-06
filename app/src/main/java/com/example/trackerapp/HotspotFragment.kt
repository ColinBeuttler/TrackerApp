package com.example.trackerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.HotSpotLayoutBinding

class HotspotFragment : Fragment(){

    private lateinit var binding : HotSpotLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HotSpotLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }
}