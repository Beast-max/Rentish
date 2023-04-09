package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class GetCartResponse(
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