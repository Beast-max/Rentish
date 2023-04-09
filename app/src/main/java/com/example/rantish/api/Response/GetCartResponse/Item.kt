package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Item(
    @SerialName("duration")
    @Expose
    var duration: Int,
    @SerialName("_id")
    @Expose
    var id: String,
    @SerialName("productId")
    @Expose
    var productId: ProductId,
    @SerialName("quantity")
    @Expose
    var quantity: Int
)