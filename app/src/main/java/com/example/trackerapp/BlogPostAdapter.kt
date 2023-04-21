package com.example.trackerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trackerapp.BlogPostAdapter.BlogPostViewHolder
import com.example.trackerapp.databinding.CardViewBlogPostLayoutBinding

 class BlogPostAdapter(private val blogs: List<BlogPost>) :
    RecyclerView.Adapter<BlogPostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogPostViewHolder {
        return BlogPostViewHolder(CardViewBlogPostLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BlogPostViewHolder, position: Int) {
        holder.bind(blogs[position])
    }

    override fun getItemCount(): Int {
        return blogs.size
    }

    class BlogPostViewHolder(val binding: CardViewBlogPostLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(blog: BlogPost) {
            binding.postLocation.text = blog.location
            binding.postDate.text = blog.date
            binding.postDescription.text = blog.description
        }
    }
}