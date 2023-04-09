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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onclick() {

    }


}