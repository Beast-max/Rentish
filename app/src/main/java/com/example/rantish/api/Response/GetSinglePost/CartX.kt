package com.example.rantish.api.Response.GetSinglePost


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CartX(
    @SerializedName("items")
    @Expose
    var items: List<Item>
)