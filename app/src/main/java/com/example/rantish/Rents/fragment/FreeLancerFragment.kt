package com.example.rantish.Rents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rantish.R
import com.example.rantish.databinding.FragmentFreeLancerBinding


class FreeLancerFragment : Fragment() {
    private lateinit var binding:FragmentFreeLancerBinding
    private val name:String? by lazy {
        arguments?.getString("name")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentFreeLancerBinding.inflate(layoutInflater)
        binding.name.text = name
        return binding.root
    }


}