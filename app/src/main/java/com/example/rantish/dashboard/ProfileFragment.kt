package com.example.rantish.dashboard

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
import com.example.rantish.databinding.FragmentProfileBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : Fragment() {
    private val viewModel:MainViewModel by viewModels()
    private lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)
        viewModel.getAllUser()
        observerViewModel()
        binding.personalTxt.setOnClickListener {
            binding.personal.visibility = View.VISIBLE
        }
        binding.doscLayout.setOnClickListener {
            binding.docs.visibility  = View.VISIBLE
            binding.personal.visibility = View.GONE
        }
        return binding.root
    }
    private fun observerViewModel(){
        viewModel.getUserResponse.observe(viewLifecycleOwner, Observer {
            if(it.type=="success"){
                binding.txtPassword.setText(it.data.email.value)
                binding.txtName.setText(it.data.username)
                binding.txtPhone.setText(it.data.phonenumber.value)
                binding.txtAddress.setText(it.data.address)
                binding.editTextTextPersonName.setText(it.data.validation.documentnumber)
                binding.name.text = it.data.username
            }
        })
    }


}