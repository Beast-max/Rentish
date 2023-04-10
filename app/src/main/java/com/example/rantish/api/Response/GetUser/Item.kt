package com.example.rantish.api.Response.GetUser


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

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