package com.example.rantish.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rantish.MainActivity
import com.example.rantish.R
import kotlinx.android.synthetic.main.fragment_verification_success.*
import kotlinx.android.synthetic.main.fragment_verification_success.view.*


class VerificationSuccessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_verification_success, container, false)
            view.materialButton.setOnClickListener {
            val intent = Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}