package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Email(
    @SerializedName("isVer")
    @Expose
    var isVer: Boolean,
    @SerializedName("value")
    @Expose
    var value: String
)