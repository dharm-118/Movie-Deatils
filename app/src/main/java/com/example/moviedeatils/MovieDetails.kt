package com.example.moviedeatils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.moviedeatils.R.drawable
import com.example.moviedeatils.R.drawable.*

class MovieDetails : AppCompatActivity() {
    private lateinit var model: Model
    private lateinit var mMovieName : TextView
    private lateinit var mMovieDescription : TextView
    private lateinit var mMoviePoster : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        mMovieName = findViewById(R.id.movieDetailsMovieName)
        mMovieDescription = findViewById(R.id.movieDetailsMovieDescription)
        mMoviePoster = findViewById(R.id.movieDetailsIcon)

        val name =intent.getStringExtra("name")
        mMovieName.text = name
        val description = intent.getStringExtra("description")
        mMovieDescription.text = description
        val poster = intent.getIntExtra("movie poster",0)
        mMoviePoster.setImageResource(poster)


    }
}