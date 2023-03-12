package com.example.rantish.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        val callback = requireActivity().onBackPressedDispatcher.addCallback(requireActivity()) {
            findNavController().popBackStack()

        }
        view.signup.setOnClickListener { findNavController().navigate(R.id.action_signUpFragment_to_verificationSuccessFragment) }
        return view
    }


}