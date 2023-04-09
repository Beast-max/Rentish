package com.example.rantish.api.Response.CartResponse


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class AddToCartResponse(
    @SerializedName("data")
    @Expose
    var `data`: Data,
    @SerializedName("message")
    @Expose
    var message: String,
    @SerializedName("statusCode")
    @Expose
    var statusCode: Int,
    @SerializedName("type")
    @Expose
    var type: String
)