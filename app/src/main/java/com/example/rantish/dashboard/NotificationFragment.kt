package com.example.rantish.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rantish.R
import com.example.rantish.dashboard.adapter.Adapter
import kotlinx.android.synthetic.main.fragment_notification.view.*

class NotificationFragment : Fragment(),Adapter.onclick {

    var list2 = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_notification, container, false)
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
        view.noti.adapter = Adapter(list2,3,this)
        return view
    }

    override fun onclick() {

    }


}