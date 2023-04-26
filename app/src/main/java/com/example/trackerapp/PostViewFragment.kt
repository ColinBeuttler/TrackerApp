package com.example.trackerapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.TrendingPostsBinding
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class PostViewFragment : Fragment() {

    private lateinit var binding: TrendingPostsBinding
    private lateinit var blogPostAdapter: BlogPostAdapter
    private var blogPostList = ArrayList<BlogPost>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TrendingPostsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadBlogPosts()

        blogPostAdapter = BlogPostAdapter(blogPostList)

        binding.rvBlogPost.adapter = blogPostAdapter

    }



    private fun loadBlogPosts() {
        val data = arguments?.getBundle("data")

        Log.v(TAG, data.toString())


        if (data != null) {
            val newPost = Json.decodeFromString<BlogPost>(data.toString())
            blogPostList.add(newPost)
        }

        blogPostList.add(
            BlogPost(
                "Costa Mesa",
                "Today",
                "Observed Spherical Object over Costa Mesa this afternoon."
            )
        )
    }
}



