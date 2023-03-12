package com.example.rantish.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.dashboard.adapter.Adapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(),Adapter.onclick {

    var list = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        view.imageView9.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_profileFragment)
        }
        list.add("audi")
        list.add("audi")
        list.add("audi")
        list.add("audi")
        list.add("audi")
        list.add("audi")
        list.add("audi")
        list.add("audi")
        list.add("audi")



        view.recycler.adapter = Adapter(list,0,this)
        view.cate.adapter =  Adapter(list,1,this)
        return view
    }

    override fun onclick() {
        findNavController().navigate(R.id.action_home_to_cartFragment)
    }
}