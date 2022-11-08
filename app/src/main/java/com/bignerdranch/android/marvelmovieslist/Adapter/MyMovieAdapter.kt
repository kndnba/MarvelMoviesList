package com.bignerdranch.android.marvelmovieslist.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.marvelmovieslist.BioActivity
import com.bignerdranch.android.marvelmovieslist.Model.Movie
import com.bignerdranch.android.marvelmovieslist.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout.view.*

class MyMovieAdapter (private val context: Context, private val movieList: MutableList<Movie>) : RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image : ImageView = itemView.image_movie
        val txt_name : TextView = itemView.txt_name
        val txt_team : TextView = itemView.txt_team
        val txt_createdby : TextView = itemView.txt_createdby


        fun bind(listItem : Movie){
            image.setOnClickListener {
                Toast.makeText(it.context, "pressed on ${image}", Toast.LENGTH_SHORT).show()
            }
            itemView.setOnClickListener{
                val intent = Intent(it.context, BioActivity::class.java)
                intent.putExtra("bio", listItem.bio)
                startActivity(it.context, intent, null)
            }
        }
    }

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : MyViewHolder  {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)
        Picasso.get().load(movieList[position].imageurl).into(holder.image)
        holder.txt_name.text = movieList[position].name
        holder.txt_team.text = movieList[position].team
        holder.txt_createdby.text = movieList[position].createdby
    }
}