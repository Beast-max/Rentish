package com.example.rantish.Rents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.Rents.Adapter.PostAdapter
import com.example.rantish.databinding.FragmentDashBoardRentishBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashBoardRentishFragment : Fragment() {
    val viewModel:MainViewModel  by viewModels()
    val adapter = PostAdapter()
    private lateinit var binding:FragmentDashBoardRentishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDashBoardRentishBinding.inflate(layoutInflater)
        viewModel.getAllPost()
        binding.postRv.adapter = adapter
        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_dashBoardRentishFragment_to_createPostFragment)
        }
        observer()
        return binding.root
    }
    fun observer(){
        viewModel.getAll.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it.data)
        })
    }

}