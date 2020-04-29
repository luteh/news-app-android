package com.luteh.newsapp.data.remote

import com.luteh.newsapp.data.model.Article
import com.luteh.newsapp.data.model.BaseResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Luthfan Maftuh on 4/28/2020.
 */
interface ApiServiceInterface {
    @GET(ApiEndPoint.TOP_HEADLINES)
    fun getTopHeadlines(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
        @Query("q") keyword: String = ""
    ): Single<BaseResponse<Article>>

    @GET(ApiEndPoint.EVERYTHING)
    fun getEverything(
        @Query("sortBy") sortBy: String,
        @Query("language") language: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
        @Query("q") keyword: String = ""
    ): Single<BaseResponse<Article>>
}