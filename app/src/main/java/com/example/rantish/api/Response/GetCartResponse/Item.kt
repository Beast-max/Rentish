package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Item(
    @SerializedName("duration")
    @Expose
    var duration: Int,
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("productId")
    @Expose
    var productId: ProductId,
    @SerializedName("quantity")
    @Expose
    var quantity: Int
)