package com.example.moviedeatils

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setPadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),OnMovieClickListner {

    private lateinit var recyclerView: RecyclerView
    val arrayList = ArrayList<Model>()





    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recView)
        arrayList.add(Model("Fast &Furious 9","This is Fast and Furious 9 Description",R.drawable.f9,"8/10"))
        arrayList.add(Model("Tom & Jerry The Movie","This is Tom & Jerry The Movie Description",R.drawable.soul,"10/10"))
        arrayList.add(Model("Kung Fu Panda","This is Kung Fu Panda Description",R.drawable.kungfupanda,"6/10"))
        arrayList.add(Model("Soul","This is Soul Description",R.drawable.soul,"9/10"))

        val myAdapterClass = MyAdapterClass(arrayList,this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapterClass
        myAdapterClass.notifyDataSetChanged()




    }

    override fun onMovieItemClicked(position: Int) {
        val intent = Intent(this,MovieDetails::class.java)
        intent.putExtra("name",arrayList[position].mMovieName)
        intent.putExtra("description",arrayList[position].mMovieDescription)
        intent.putExtra("movie poster",arrayList[position].image)
        startActivity(intent)
    }



}