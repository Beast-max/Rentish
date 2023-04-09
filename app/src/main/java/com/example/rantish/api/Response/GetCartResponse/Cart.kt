package com.example.rantish.api.Response.GetCartResponse


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class Cart(
    @SerializedName("items")
    @Expose
    var items: List<Item>
)