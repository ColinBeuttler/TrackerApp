package com.example.trackerapp


import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.trackerapp.databinding.TrendingPostsBinding


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

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadBlogPosts()

        blogPostAdapter = BlogPostAdapter(blogPostList)

        binding.rvBlogPost.adapter = blogPostAdapter

    }



    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun loadBlogPosts() {

        blogPostList.add(
            BlogPost(
                "Costa Mesa",
                "Today",
                "Observed Spherical Object over Costa Mesa this afternoon."
            )
        )
    }
}



