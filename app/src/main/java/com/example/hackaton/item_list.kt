package com.example.hackaton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewRealize: RecyclerView.Adapter<ViewHolderRealize>() {

    var list = Array<Realize>(12){
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New book for kids", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New album", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New house", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New room", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New album", "Bla bla bla bla", R.drawable.trophy)
        Realize("New house", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New room", "Bla bla bla bla", R.drawable.trophy)
        Realize("New room", "Bla bla bla bla", R.drawable.trophy)
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRealize {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_view, parent, false)

        return ViewHolderRealize(view)
    }

    override fun onBindViewHolder(holder: ViewHolderRealize, position: Int) {
        holder.onBing(list[position])
    }
    override fun getItemCount(): Int {
        return list.size
    }
}
class ViewHolderRealize(item: View): RecyclerView.ViewHolder(item){
    var title = item.findViewById<TextView>(R.id.title)
    var about = item.findViewById<TextView>(R.id.about)
    var image = item.findViewById<ImageView>(R.id.icon)
    fun onBing(realize: Realize){
        title.text = realize.name
    }
}