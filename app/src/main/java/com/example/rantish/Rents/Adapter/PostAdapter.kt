package com.example.rantish.Rents.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rantish.R
import com.example.rantish.Rents.fragment.data
import com.example.rantish.api.Response.GetAllResponse.Data
import com.example.rantish.api.Response.PostResponse
import com.example.rantish.dashboard.adapter.Adapter

class PostAdapter (val listner:oclick): ListAdapter<Data, PostAdapter.ViewHolder>(object : DiffUtil.ItemCallback<Data>(){
    override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem==newItem
    }

    override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
        return oldItem==newItem
    }

}) {
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val name = ItemView.findViewById<TextView>(R.id.name)
        val root = ItemView.findViewById<CardView>(R.id.root)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.item_freelancers,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val po = getItem(position)
        holder.name.text = po.title
        holder.root.setOnClickListener { listner.onclick(po.id) }
    }
    interface oclick{
        fun onclick(id:String)
    }
}