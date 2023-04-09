package com.example.rantish.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.api.Request.SignUprequest
import com.example.rantish.databinding.FragmentSignUpBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SignUpFragment : Fragment() {
    private val viewModel:MainViewModel by viewModels()
    private lateinit var binding:FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentSignUpBinding.inflate(layoutInflater)
        val callback = requireActivity().onBackPressedDispatcher.addCallback(requireActivity()) {
            findNavController().popBackStack()

        }
        binding.signup.setOnClickListener { findNavController().navigate(R.id.action_signUpFragment_to_verificationSuccessFragment) }

        binding.signup.setOnClickListener {
            viewModel.signup(binding.txtEmail.toString(),binding.txtName.toString(),binding.txtPassword.toString()
                ,binding.txtPhone.toString(),binding.txtAddress.toString())
        }
        observerViewModel()
        return binding.root
    }

    fun observerViewModel(){
        viewModel.signUpLiveData.observe(viewLifecycleOwner, Observer {
            if(it.type=="success"){
                  findNavController().navigate(R.id.action_signUpFragment_to_verificationSuccessFragment)

            }

        })
    }


}