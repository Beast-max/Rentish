package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductId(
    @SerialName("categoryy")
    @Expose
    var categoryy: String,
    @SerialName("costprice")
    @Expose
    var costprice: String,
    @SerialName("coupon")
    @Expose
    var coupon: List<Any>,
    @SerialName("createdAt")
    @Expose
    var createdAt: String,
    @SerialName("deposit")
    @Expose
    var deposit: Int,
    @SerialName("description")
    @Expose
    var description: String,
    @SerialName("_id")
    @Expose
    var id: String,
    @SerialName("image")
    @Expose
    var image: List<String>,
    @SerialName("manufacturer")
    @Expose
    var manufacturer: String,
    @SerialName("name")
    @Expose
    var name: String,
    @SerialName("onrent")
    @Expose
    var onrent: Boolean,
    @SerialName("quantity")
    @Expose
    var quantity: Int,
    @SerialName("rentalprice")
    @Expose
    var rentalprice: Int,
    @SerialName("updatedAt")
    @Expose
    var updatedAt: String,
    @SerialName("__v")
    @Expose
    var v: Int
)