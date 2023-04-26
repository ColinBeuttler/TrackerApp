package com.example.trackerapp

import kotlinx.serialization.Serializable

@Serializable
data class BlogPost(val location: String, val date: String?, val description: String?)
