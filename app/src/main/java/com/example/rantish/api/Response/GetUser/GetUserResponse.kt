package com.example.rantish.api.Response.GetUser


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class GetUserResponse(
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