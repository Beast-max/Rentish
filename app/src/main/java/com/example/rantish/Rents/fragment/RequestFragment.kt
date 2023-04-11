package com.example.rantish.Rents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rantish.R
import com.example.rantish.databinding.FragmentRequestBinding


class RequestFragment : Fragment() {
    private lateinit var binding:FragmentRequestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRequestBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = mutableListOf<data>()
        list.add(data("prateek","developer"))
        list.add(data("khhushal","developer"))

        list.add(data("karunn","developer"))

        list.add(data("murtoza","developer"))

        list.add(data("rahul","developer"))

        list.add(data("prateek","developer"))


    }
}

data class data(val name:String,val title:String)