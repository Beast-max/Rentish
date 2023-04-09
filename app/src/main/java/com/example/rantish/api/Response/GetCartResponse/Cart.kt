package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Cart(
    @SerialName("items")
    @Expose
    var items: List<Item>
)