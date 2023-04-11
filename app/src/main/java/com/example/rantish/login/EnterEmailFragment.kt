package com.example.rantish.login

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.rantish.Extensions.Token
import com.example.rantish.R
import com.example.rantish.api.Request.LoginRequest
import com.example.rantish.databinding.FragmentEnterEmailBinding
import com.example.rantish.databinding.FragmentLoginBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class EnterEmailFragment : Fragment() {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: FragmentEnterEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentEnterEmailBinding.inflate(layoutInflater)
        val callback = requireActivity().onBackPressedDispatcher.addCallback(requireActivity()) {
            findNavController().popBackStack()

        }
        binding.materialButton.setOnClickListener {
            val request = LoginRequest(binding.txtEmail.text.toString(),binding.txtPassword.text.toString())
            viewModel.login(request)
            binding.progressBar.visibility  = View.VISIBLE
        }
        observerViewModel()
        return binding.root
    }
    fun observerViewModel(){
        viewModel.loginLiveData.observe(viewLifecycleOwner, Observer {
            if(it.type=="success"){
                findNavController().navigate(R.id.action_enterEmailFragment_to_verificationSuccessFragment)
                Token.token = it.data.accessToken
            }
            else{
                binding.progressBar.visibility  = View.VISIBLE
            }
        })
    }

}