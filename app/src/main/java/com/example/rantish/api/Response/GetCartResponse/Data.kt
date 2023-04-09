package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("total")
    @Expose
    var total: Int,
    @SerialName("user")
    @Expose
    var user: User
)