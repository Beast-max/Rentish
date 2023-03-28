package com.example.rantish.api.Response.SignUpResponse


import com.example.rantish.api.Response.SignUpResponse.Data
import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @SerializedName("data")
    var `data`: Data,
    @SerializedName("message")
    var message: String,
    @SerializedName("statusCode")
    var statusCode: Int,
    @SerializedName("type")
    var type: String
)