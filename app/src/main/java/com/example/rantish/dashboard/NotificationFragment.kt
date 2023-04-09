package com.example.rantish.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rantish.R
import com.example.rantish.dashboard.adapter.Adapter
import com.example.rantish.databinding.FragmentNotificationBinding


class NotificationFragment : Fragment(),Adapter.onclick {
    private lateinit var binding:FragmentNotificationBinding
    var list2 = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        list2.add("New information :   designs on Dribbble.\n" +
                " Your resource to discover")
        binding.noti.adapter = Adapter(list2,3,this)
        return binding.root
    }

    override fun onclick() {

    }


}