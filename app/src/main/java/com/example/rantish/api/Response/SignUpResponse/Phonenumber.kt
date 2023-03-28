package com.example.rantish.api.Response.SignUpResponse


import com.google.gson.annotations.SerializedName

data class Phonenumber(
    @SerializedName("isVer")
    var isVer: Boolean,
    @SerializedName("value")
    var value: String
)