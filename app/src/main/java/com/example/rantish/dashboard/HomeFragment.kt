package com.example.rantish.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.dashboard.adapter.Adapter
import com.example.rantish.databinding.FragmentHomeBinding


class HomeFragment : Fragment(),Adapter.onclick {
    private lateinit var binding:FragmentHomeBinding
    var list = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.imageView9.setOnClickListener {
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



        binding.recycler.adapter = Adapter(list,0,this)
        binding.cate.adapter =  Adapter(list,1,this)
        return binding.root
    }

    override fun onclick() {
        findNavController().navigate(R.id.action_home_to_cartFragment)
    }
}