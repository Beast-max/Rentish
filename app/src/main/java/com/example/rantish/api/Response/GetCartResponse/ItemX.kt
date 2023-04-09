package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ItemX(
    @SerialName("_id")
    @Expose
    var id: String
)