package com.example.hackaton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewRealize(var fragment: Fragment): RecyclerView.Adapter<RecyclerViewRealize.Companion.ViewHolderRealize>() {

    var list = Array<Realize>(12){
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New book for kids", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New album", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New house", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New room", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New album", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New house", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New room", "Bla bla bla bla", R.drawable.trophy_gr_black)
        Realize("New book", "Bla bla bla bla", R.drawable.trophy_gr_black)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRealize {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_view, parent, false)


        return ViewHolderRealize(view, fragment)
    }
    override fun onBindViewHolder(holder: ViewHolderRealize, position: Int) {
        holder.onBing(list[position])
    }
    override fun getItemCount(): Int {
        return list.size
    }
    companion object{
        class ViewHolderRealize(item: View, var fragment: Fragment): RecyclerView.ViewHolder(item){

            val card = item.findViewById<CardView>(R.id.card)

            var title = item.findViewById<TextView>(R.id.title)
            var about = item.findViewById<TextView>(R.id.about)
            var image = item.findViewById<ImageView>(R.id.icon)
            fun onBing(realize: Realize){
                title.text = realize.name
                card.setOnClickListener{
                    fragment.requireActivity().findNavController(R.id.nav_host_fragment)
                            .navigate(R.id.missionFragment)
                }
            }
        }
    }
}
