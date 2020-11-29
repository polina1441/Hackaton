package com.example.hackaton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProgressFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_progress, container, false)
        val recyclerViewRealize : RecyclerView = root.findViewById(R.id.recyclerView)

        recyclerViewRealize.adapter = RecyclerViewRealize(this)
        recyclerViewRealize.layoutManager = LinearLayoutManager(requireContext())

//        val navController = requireActivity().findNavController(R.id.nav_host_fragment)
//        val appBarConfiguration = AppBarConfiguration(setOf(
//                R.id.progressFragment))
//        setupActionBarWithNavController(navController, appBarConfiguration)




        return root
    }
}