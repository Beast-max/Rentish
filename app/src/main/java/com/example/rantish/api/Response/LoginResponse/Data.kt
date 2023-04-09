package com.example.rantish.api.Response.LoginResponse


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("accessToken")
    @Expose
    var accessToken: String,
    @SerializedName("refreshToken")
    @Expose
    var refreshToken: String
)