package com.example.retrofitclient.helper

import com.example.retrofitclient.custom.MyService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MyRepsitory{

    fun create():MyService{
        val retro = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://jsonplaceholder.typicode.com/")
            .build()
        return retro.create(MyService::class.java)
    }
}