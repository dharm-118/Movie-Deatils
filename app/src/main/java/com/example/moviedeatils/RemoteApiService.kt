package com.example.moviedeatils

import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://api.themoviedb.org/3"
const val API_KEY = "13440c80d34b8bcfc20f27297fac6249"

interface RemoteApiService {


    @GET("movie/550?api_key=$API_KEY")
    fun getMovieDetails(
        @Query("original_title") mMovieName: String,
        @Query("overview") mMovieDescription: String,
        @Query("poster_path") mMoviePoster : Int,
        @Query("popularity") mMovieRating : Int
    ): retrofit2.Call<movieListDetails>
}