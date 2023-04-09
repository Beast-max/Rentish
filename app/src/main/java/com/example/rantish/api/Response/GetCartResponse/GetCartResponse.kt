package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetCartResponse(
    @SerialName("data")
    @Expose
    var `data`: Data,
    @SerialName("message")
    @Expose
    var message: String,
    @SerialName("statusCode")
    @Expose
    var statusCode: Int,
    @SerialName("type")
    @Expose
    var type: String
)