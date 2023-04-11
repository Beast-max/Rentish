package com.example.rantish.Rents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

import com.example.rantish.databinding.FragmentPostViewBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostViewFragment : Fragment() {
    private val id:String?  by lazy {
        arguments?.getString("id")
    }
    private val viewModel:MainViewModel  by viewModels()
    private lateinit var binding:FragmentPostViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentPostViewBinding.inflate(layoutInflater)
        viewModel.getSinglePost(id!!)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observerViewModel()
    }
    fun observerViewModel(){
        viewModel.getAllSinglePost.observe(viewLifecycleOwner, Observer {
            binding.textView34.text  = it.data[0].createdAt
            binding.textView35.text = it.data[0].title
            binding.textView36.text = it.data[0].description
            binding.textView38.text = "${it.data[0].pricePerHour}/hour"
        })
    }
}