package com.example.rantish.api.Response.GetFreeLancer


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Email(
    @SerializedName("isVer")
    @Expose
    var isVer: Boolean,
    @SerializedName("value")
    @Expose
    var value: String
)