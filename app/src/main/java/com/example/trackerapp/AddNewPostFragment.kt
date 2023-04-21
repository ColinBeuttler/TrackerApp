package com.example.trackerapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.AddNewPostLayoutBinding



class AddNewPostFragment : Fragment() {

    private lateinit var binding: AddNewPostLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = AddNewPostLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.postButton.setOnClickListener(View.OnClickListener { onClick() })
    }

    private fun onClick() {
        if(binding.textInputLocation.text?.isEmpty() == true){
            Log.v(TAG, "Please Enter a location")
        }
        else{
            Log.v(TAG, "Post Button activated")
        }

    }
}

