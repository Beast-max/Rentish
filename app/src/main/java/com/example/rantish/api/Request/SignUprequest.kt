package com.example.rantish.api.Request


import com.google.gson.annotations.SerializedName

data class SignUprequest(
    @SerializedName("address")
    var address: String,
    @SerializedName("email")
    var email: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("phonenumber")
    var phonenumber: String,
    @SerializedName("scope")
    var scope: String,
    @SerializedName("username")
    var username: String
)