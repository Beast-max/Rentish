package com.example.rantish.api.Response.GetAllResponse


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ItemX(
    @SerializedName("duration")
    @Expose
    var duration: Int,
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("productId")
    @Expose
    var productId: String,
    @SerializedName("quantity")
    @Expose
    var quantity: Int
)