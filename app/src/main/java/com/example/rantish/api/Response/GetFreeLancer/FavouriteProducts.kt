package com.example.rantish.api.Response.GetFreeLancer


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class FavouriteProducts(
    @SerializedName("items")
    @Expose
    var items: List<ItemX>
)