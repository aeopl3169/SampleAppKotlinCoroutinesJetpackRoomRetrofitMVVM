package com.shiva.sampleappkotlincoroutinesroomretrofitmvvm.models


import com.shiva.sampleappkotlincoroutinesroomretrofitmvvm.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)