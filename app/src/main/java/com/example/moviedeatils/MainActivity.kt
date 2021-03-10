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
        arrayList.add(Model("Fast & Furious 9",
            "About Fast and Furious 9 ..." +
                    "\n"+
                    "\n"+
                    " \nDominic Toretto and his crew join forces to battle the most skilled assassin and high-performance driver they've ever encountered -- his forsaken brother.\n" +
                "Release date: June 2021 (India)\n" +
                "Director: Justin Lin\n" +
                "Budget: \$200 million+\n" +
                "Producers: Vin Diesel, Justin Lin, Samantha Vincent, Clayton Townsend, Jeff Kirschenbaum, Neal H. Moritz, Joe Roth\n" +
                "Production companies: Universal Pictures, One Race Films, Original Film, Roth/Kirschenbaum Films",
            R.drawable.f9,
            "8/10"))
        arrayList.add(Model("Tom & Jerry The Movie",
            "About Tom And Jerry..." +
                    "\n"+
                    "\n"+
                    "\nA legendary rivalry reemerges when Jerry moves into New York City's finest hotel on the eve of the wedding of the century, forcing the desperate event planner to hire Tom to get rid of him. As mayhem ensues, the escalating cat-and-mouse battle soon threatens to destroy her career, the wedding, and possibly the hotel itself.\n" +
                    "Release date: 26 February 2021 (India)\n" +
                    "Director: Tim Story\n" +
                    "Cinematography: Alan Stewart\n" +
                    "Story by: William Hanna, Joseph Barbera\n" +
                    "Production companies: Warner Animation Group, Turner Entertainment",
            R.drawable.tomandjerry,
            "10/10"))
        arrayList.add(Model("Kung Fu Panda",
            "About Kung Fu Panda..." +
                    "\n"+
                    "\n"+
                    "\nWhen Po the Panda, a kung fu enthusiast, gets selected as the Dragon Warrior, he decides to team up with the Furious Five and destroy the evil forces that threaten the Valley of Peace.\n" +
                    "Release date: 11 July 2008 (India)\n" +
                    "Directors: Mark Osborne, John Stevenson\n" +
                    "Animated series: Kung Fu Panda: Legends of Awesomeness; Kung Fu Panda: The Paws of Destiny\n" +
                    "Film(s): Kung Fu Panda (2008); Kung Fu Panda 2 (2011); Kung Fu Panda 3 (2016)\n" +
                    "Created by: Ethan Reiff and Cyrus Voris\n" +
                    "Owned by: DreamWorks Animation",
            R.drawable.kungfupanda,
            "6/10"))
        arrayList.add(Model("Soul",
            "About Soul ..." +
                    "\n"+
                    "\n"+
                    "\nA jazz musician, stuck in a mediocre job, finally gets his big break. However, when a wrong step takes him to the Great Before, he tries to help an infant soul in order to return to reality.\n" +
                    "Initial release: 25 December 2020 (Ukraine)\n" +
                    "Director: Pete Docter\n" +
                    "Budget: \$150 million+\n" +
                    "Box office: 11.17 crores USD\n" +
                    "Screenplay: Pete Docter, Kemp Powers, Mike Jones",
            R.drawable.soul,
            "9/10"))

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