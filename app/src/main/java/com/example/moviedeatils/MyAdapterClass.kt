package com.example.moviedeatils

import android.content.Context
import android.graphics.Color
import android.graphics.ColorFilter
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random


class MyAdapterClass(
    val arrayList: ArrayList<Model>,
    private val onMovieClickListner: OnMovieClickListner
) :
    RecyclerView.Adapter<MyAdapterClass.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindItems(model: Model) {

            itemView.findViewById<TextView>(R.id.movieNameTv).text = model.mMovieName
            itemView.findViewById<TextView>(R.id.movieDescriptionTv).text = model.mMovieDescription
            itemView.findViewById<ImageView>(R.id.uiIconIv).setImageResource(model.image)
            itemView.findViewById<TextView>(R.id.ratingBar1).text = model.mRating
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {
            onMovieClickListner.onMovieItemClicked(position)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}