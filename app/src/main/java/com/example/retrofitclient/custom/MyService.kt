package com.example.retrofitclient.custom

import com.example.retrofitclient.model.MyModel
import retrofit2.Call
import retrofit2.http.GET

interface MyService{
    @GET("posts")
    fun getPosts(): Call<List<MyModel>>
}