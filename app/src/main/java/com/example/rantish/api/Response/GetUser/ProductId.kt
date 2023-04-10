package com.example.rantish.api.Response.GetUser


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ProductId(
    @SerializedName("categoryy")
    @Expose
    var categoryy: String,
    @SerializedName("costprice")
    @Expose
    var costprice: String,
    @SerializedName("coupon")
    @Expose
    var coupon: List<Any>,
    @SerializedName("createdAt")
    @Expose
    var createdAt: String,
    @SerializedName("deposit")
    @Expose
    var deposit: Int,
    @SerializedName("description")
    @Expose
    var description: String,
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("image")
    @Expose
    var image: List<String>,
    @SerializedName("manufacturer")
    @Expose
    var manufacturer: String,
    @SerializedName("name")
    @Expose
    var name: String,
    @SerializedName("onrent")
    @Expose
    var onrent: Boolean,
    @SerializedName("quantity")
    @Expose
    var quantity: Int,
    @SerializedName("rentalprice")
    @Expose
    var rentalprice: Int,
    @SerializedName("updatedAt")
    @Expose
    var updatedAt: String,
    @SerializedName("__v")
    @Expose
    var v: Int
)