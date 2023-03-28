package com.example.rantish.api.Response.LoginResponse


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("accessToken")
    var accessToken: String,
    @SerializedName("refreshToken")
    var refreshToken: String
)