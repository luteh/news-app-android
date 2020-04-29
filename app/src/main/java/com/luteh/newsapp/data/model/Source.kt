package com.luteh.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: Any, // null
    @SerializedName("name")
    val name: String // Liputan6.com
)