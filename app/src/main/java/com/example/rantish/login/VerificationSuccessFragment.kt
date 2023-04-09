package com.example.rantish.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rantish.MainActivity
import com.example.rantish.R
import com.example.rantish.databinding.FragmentHomeBinding
import com.example.rantish.databinding.FragmentVerificationSuccessBinding


class VerificationSuccessFragment : Fragment() {
    private lateinit var binding: FragmentVerificationSuccessBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVerificationSuccessBinding.inflate(layoutInflater)
        binding.materialButton.setOnClickListener {
            val intent = Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}