package com.example.rantish.Rents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.databinding.FragmentCreatePostBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreatePostFragment : Fragment() {
    private val viewModel:MainViewModel by viewModels()
    private lateinit var binding:FragmentCreatePostBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentCreatePostBinding.inflate(layoutInflater)
        binding.button.setOnClickListener {
            viewModel.createPost(binding.editText.text.toString(),binding.disc.text.toString(),binding.textView32.text.toString().toInt(),binding.textView.text.toString().toInt())
//            findNavController().popBackStack()
            Toast.makeText(requireContext(),"PostCreated",Toast.LENGTH_LONG).show()
        }
        return binding.root
    }

}