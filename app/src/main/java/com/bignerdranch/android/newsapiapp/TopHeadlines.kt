package com.bignerdranch.android.newsapiapp

data class TopHeadlines (
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)