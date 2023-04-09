package com.example.rantish.api.Request


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SignUprequest(
    @SerializedName("address")
    @Expose
    var address: String,
    @SerializedName("email")
    @Expose
    var email: String,
    @SerializedName("password")
    @Expose
    var password: String,
    @SerializedName("phonenumber")
    @Expose
    var phonenumber: String,
    @SerializedName("scope")
    @Expose
    var scope: String,
    @SerializedName("username")
    @Expose
    var username: String
)