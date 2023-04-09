package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class FavouriteProducts(
    @SerializedName("items")
    @Expose
    var items: List<ItemX>
)