package com.example.rantish.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.recyclerview.widget.RecyclerView
import com.example.rantish.R
import kotlinx.android.synthetic.main.car_item_layout.view.*

class Adapter(val mList: List<String>,val type:Int,val listner:onclick): RecyclerView.Adapter<Adapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view:View?=null
       if(type==0){
            view = LayoutInflater.from(parent.context)
               .inflate(R.layout.car_item_layout, parent, false)
       }else if(type==1){
           view = LayoutInflater.from(parent.context)
               .inflate(R.layout.item_categories, parent, false)
       }
        else{
           view = LayoutInflater.from(parent.context)
               .inflate(R.layout.item_notification, parent, false)
       }


        return ViewHolder(view!!)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class

        // sets the text to the textview from our itemHolder class
        holder.title.text = ItemsViewModel
        holder.root.setOnClickListener {
            listner.onclick()
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val root:ConstraintLayout = itemView.findViewById(R.id.root)
    }
    interface onclick{
        fun onclick()
    }
}