package com.example.rantish.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.databinding.FragmentLoginBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : Fragment() {
    private val viewModel:MainViewModel by viewModels()
    private lateinit var binding:FragmentLoginBinding
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
          binding = FragmentLoginBinding.inflate(layoutInflater)

            binding.login.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_enterEmailFragment)
            }

            binding.emailLogin.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
            }

            return binding.root
        }
    fun observerViewModel(){
        viewModel.loginLiveData.observe(viewLifecycleOwner, Observer {
            if(it.type=="success"){

            }
        })
    }


    }