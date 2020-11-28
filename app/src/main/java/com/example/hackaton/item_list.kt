package com.example.hackaton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewRealize: RecyclerView.Adapter<ViewHolderRealize>() {

    var list = Array<Realize>(12){ Realize() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRealize {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.realize_list, parent, false)

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
    fun onBing(realize: Realize){
        title.text = realize.name
    }
}