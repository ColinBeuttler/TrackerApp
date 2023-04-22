package com.example.trackerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.TrendingPostsBinding

class PostViewFragment : Fragment(){

    private lateinit var binding : TrendingPostsBinding
    private lateinit var blogPostAdapter: BlogPostAdapter
    private lateinit var blogPostList: List<BlogPost>

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
        blogPostList = listOf(
            BlogPost("Costa Mesa", "Today", "Observed Spherical Object over Costa Mesa this afternoon."),
            BlogPost("Catalina Island", "Oct. 21, 2016", "Bright lights observed outside of Avalon, disappeared after a few seconds.")
        )
    }

}