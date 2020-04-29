package com.luteh.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("status")
    val status: String, // ok
    @SerializedName("totalResults")
    val totalResults: Int, // 39
    @SerializedName("articles")
    val articles: T
)