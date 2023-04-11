package com.example.rantish.api.Response.GetAllResponse


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Cart(
    @SerializedName("items")
    @Expose
    var items: List<ItemX>
)