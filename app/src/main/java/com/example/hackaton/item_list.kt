package com.example.hackaton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewRealize(var fragment: Fragment): RecyclerView.Adapter<RecyclerViewRealize.ViewHolderRealize>() {
    companion object{
        var listR = arrayListOf(
            Realize("Новый писатель", "Познакомьтесь с ним", R.drawable.mask),
            Realize("Первые шаги", "C чего все начиналось", R.drawable.certificate),
            Realize("Книги", "Некоторые произведения", R.drawable.inkwell),
            Realize("Известность", "Как о нем узнал весь мир", R.drawable.megaphone),
            Realize("Жизнь", "Жизненный путь писателя", R.drawable.torch),
            Realize("Экранизации", "Книги, которые стали фильмом", R.drawable.clapperboard),
            Realize("Дом-музей", "Познакомься с бытом", R.drawable.house),
            Realize("Награды", "Заслуги и награды писателя", R.drawable.trophy_gr_black),
            Realize("Наследие", "Что осталось после смерти", R.drawable.autograph)
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRealize {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_view, parent, false)


        return ViewHolderRealize(view)
    }
    override fun onBindViewHolder(holder: ViewHolderRealize, position: Int) {
        holder.onBing(listR[position])
    }
    override fun getItemCount(): Int {
        return listR.size
    }
    inner class ViewHolderRealize(item: View): RecyclerView.ViewHolder(item){
            val card = item.findViewById<CardView>(R.id.card)
            var title = item.findViewById<TextView>(R.id.title)
            var about = item.findViewById<TextView>(R.id.about)
            var image = item.findViewById<ImageView>(R.id.icon)
            fun onBing(realize: Realize){

                title.text = realize.name
                about.text = realize.about
                image.setImageResource(realize.image)

                card.setOnClickListener{
                    var bundle = Bundle()
                    bundle.putString("POLE", realize.name)
                    fragment.requireActivity().findNavController(R.id.nav_host_fragment)
                            .navigate(R.id.missionFragment, bundle)
                }
            }
        }

}
