package com.example.musicpost

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GetPostAPI {

    @GET("api/posts")
    fun getPosts(
            @Header("Authorization") authHeader: String,
            @Query("page") page: Int,
            @Query("size") size : Int,
            @Query("currentLongitude") currentLongitude : Double,
            @Query("currentLatitude") currentLatitude : Double,
            @Query("radius") radius : Int
    ): Call<List<PostDto>>
}