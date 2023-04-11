package com.example.rantish.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.rantish.R
import com.example.rantish.Rents.RentsActivity
import com.example.rantish.dashboard.adapter.Adapter
import com.example.rantish.dashboard.adapter.CategoriesAdapter
import com.example.rantish.databinding.FragmentHomeBinding
import com.example.rantish.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(),Adapter.onclick {
    private val viewModel :MainViewModel by viewModels()
    private lateinit var binding:FragmentHomeBinding
    var list = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.rents.setOnClickListener {
            val intent = Intent(requireContext(),RentsActivity::class.java)
            startActivity(intent)

        }
        binding.imageView9.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_profileFragment)
        }
        val list = mutableListOf<String>()
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")
        list.add("dummy")

        val adapter  = CategoriesAdapter()
        binding.cate.adapter = adapter
        adapter.submitList(list)
        viewModel.getAllProduct()
        observerViewModel()
        return binding.root
    }
    fun observerViewModel(){
        viewModel.allProduct.observe(viewLifecycleOwner, Observer {
            binding.recycler.adapter = Adapter(it.data,0,this)
        })
    }

    override fun onclick(id:String) {
//        viewModel.addProduct(id)
    }
}