package com.example.rantish.Rents.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rantish.R
import com.example.rantish.Rents.fragment.data
import com.example.rantish.dashboard.adapter.Adapter
import com.example.rantish.dashboard.adapter.CategoriesAdapter

class RequestAdapter : ListAdapter<data, RequestAdapter.ViewHolder>(object : DiffUtil.ItemCallback<data>(){
    override fun areItemsTheSame(oldItem: data, newItem: data): Boolean {
        return oldItem==newItem
    }

    override fun areContentsTheSame(oldItem: data, newItem: data): Boolean {
        return oldItem==newItem
    }

}) {
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val name = ItemView.findViewById<TextView>(R.id.textView41)
        val title= ItemView.findViewById<TextView>(R.id.textView42)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.request_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val po = getItem(position)
        holder.name.text = po.name
        holder.title.text = po.title
    }
}