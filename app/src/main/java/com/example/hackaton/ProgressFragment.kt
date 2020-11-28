package com.example.hackaton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProgressFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_progress, container, false)
        val recyclerViewRealize : RecyclerView = root.findViewById(R.id.recyclerView)

        recyclerViewRealize.adapter = RecyclerViewRealize()
        recyclerViewRealize.layoutManager = LinearLayoutManager(requireContext())

        return root
    }
}

class Realize{
    var name = "Title"

    override fun toString(): String {
        return name
    }
}