package com.example.hackaton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)

        val start: Button = root.findViewById(R.id.start)

        val navController = requireActivity().findNavController(R.id.nav_host_fragment)

        start.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_progressFragment)
        }

        /*val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.progressFragment))
        setupActionBarWithNavController(navController,appBarConfiguration)*/
                return root
    }
}