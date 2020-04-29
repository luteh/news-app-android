package com.luteh.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("source")
    val source: Source,
    @SerializedName("author")
    val author: String, // Agustin Setyo Wardani
    @SerializedName("title")
    val title: String, // Cara Silaturahmi Lewat Video Call di WhatsApp hingga 8 Orang - Liputan6.com
    @SerializedName("description")
    val description: String, // Video call WhatsApp hingga 8 orang bisa kamu manfaatkan untuk bersilaturahmi bersama keluarga selama Ramadan atau Idul Fitri.
    @SerializedName("url")
    val url: String, // https://www.liputan6.com/ramadan/read/4240557/cara-silaturahmi-lewat-video-call-di-whatsapp-hingga-8-orang
    @SerializedName("urlToImage")
    val urlToImage: String, // https://cdn0-production-images-kly.akamaized.net/RLIeBwXfliLkkt6AhjGrUqazDuA=/673x379/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3114808/original/098549900_1588122303-New_Project.jpg
    @SerializedName("publishedAt")
    val publishedAt: String, // 2020-04-29T15:43:23Z
    @SerializedName("content")
    val content: String // Liputan6.com, Jakarta -WhatsApp baru saja menghadirkan fitur baru pada grup video call atau voice call (group call).Kini, kamu bisa saling terhubung menggunakan fitur grup video call hingga 8 orang. Fitur ini pun bisa dimanfaatkan untuk bersilaturahmi bersa… [+1018 chars]
)