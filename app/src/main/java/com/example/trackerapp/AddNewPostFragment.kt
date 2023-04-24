package com.example.trackerapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.AddNewPostLayoutBinding


class AddNewPostFragment : Fragment() {

    private lateinit var binding: AddNewPostLayoutBinding
    private lateinit var newPost: BlogPost

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
        val locationText = binding.textInputLocation.text.toString()
        val dateText = binding.textInputDateTime.text.toString()
        val descriptionText = binding.textInputDescription.text.toString()

        if(locationText.isEmpty()){
            Log.v(TAG, "Please Enter a location")
        }
        else if (dateText.isEmpty()){
            Log.v(TAG, "Please enter a valid date")
        }
        else if (descriptionText.isEmpty()){
            Log.v(TAG, "Please enter a description")
        }
        else{
            Log.v(TAG, "Post Button activated")
            newPost = BlogPost(locationText, dateText, descriptionText)
            Toast.makeText(activity, newPost.toString(), Toast.LENGTH_LONG).show()
        }

    }
}

