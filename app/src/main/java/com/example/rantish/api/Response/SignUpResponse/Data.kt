package com.example.rantish.api.Response.SignUpResponse


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("address")
    var address: String,
    @SerializedName("cart")
    var cart: Cart,
    @SerializedName("email")
    var email: Email,
    @SerializedName("favouriteProducts")
    var favouriteProducts: FavouriteProducts,
    @SerializedName("_id")
    var id: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("phonenumber")
    var phonenumber: Phonenumber,
    @SerializedName("scope")
    var scope: String,
    @SerializedName("username")
    var username: String,
    @SerializedName("__v")
    var v: Int
)