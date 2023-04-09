package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Phonenumber(
    @SerialName("isVer")
    @Expose
    var isVer: Boolean,
    @SerialName("value")
    @Expose
    var value: String
)