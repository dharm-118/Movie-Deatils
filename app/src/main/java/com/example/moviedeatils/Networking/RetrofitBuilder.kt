package com.example.moviedeatils.Networking

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


private val mRxAdapter = RxJava3CallAdapterFactory.create()
private var mGson  = GsonBuilder()
    .setLenient()
    .create()

fun buildClient(): OkHttpClient =
    OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().apply{
        level = HttpLoggingInterceptor.Level.BODY
    })
        .build()

fun buildRetrofit():Retrofit{
    return Retrofit.Builder()
        .client(buildClient())
        .addCallAdapterFactory(mRxAdapter)
        .addConverterFactory(GsonConverterFactory.create(mGson))
        .baseUrl("https://api.themoviedb.org/3/movie/550?api_key=31ebe6c4968f9bdb0085f8953c3372e6")
        .build()
}

//fun buildApiService(): RemoteApiService =
    //buildRetrofit().create(RemoteApiService::class.java)


