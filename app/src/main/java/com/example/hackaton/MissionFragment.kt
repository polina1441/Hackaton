package com.example.hackaton
import android.graphics.Matrix
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    var a :Realize? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("POLE")
            param2 = it.getString(ARG_PARAM2)
        }
        a = RecyclerViewRealize.listR.find { it.name == param1 }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root =  inflater.inflate(R.layout.fragment_mission, container, false)
        val navController = requireActivity().findNavController(R.id.nav_host_fragment)

        val title = root.findViewById<TextView>(R.id.title)
        val about = root.findViewById<TextView>(R.id.about)
        val image = root.findViewById<ImageView>(R.id.icon)
        title.text = a?.name ?: "Неизвестно"
        about.text = a?.about ?: "Неизвестно"
        image.setImageResource(a?.image ?: R.drawable.not_image)


        return root
    }
    companion object {
        fun newInstance(param1: String, param2: String) =
                BlankFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}