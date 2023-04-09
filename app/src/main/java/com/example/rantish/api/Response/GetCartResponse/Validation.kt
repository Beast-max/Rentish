package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Validation(
    @SerialName("documentnumber")
    @Expose
    var documentnumber: String,
    @SerialName("documenttype")
    @Expose
    var documenttype: String
)