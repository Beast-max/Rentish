package com.example.rantish.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import kotlinx.android.synthetic.main.fragment_enter_email.*
import kotlinx.android.synthetic.main.fragment_enter_email.view.*


class EnterEmailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view  =  inflater.inflate(R.layout.fragment_enter_email, container, false)
            view.materialButton.setOnClickListener {
            findNavController().navigate(R.id.action_enterEmailFragment_to_verificationSuccessFragment)
        }
        val callback = requireActivity().onBackPressedDispatcher.addCallback(requireActivity()) {
            findNavController().popBackStack()

        }
        return view
    }

}