package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class User(
    @SerializedName("address")
    @Expose
    var address: String,
    @SerializedName("cart")
    @Expose
    var cart: Cart,
    @SerializedName("email")
    @Expose
    var email: Email,
    @SerializedName("favouriteProducts")
    @Expose
    var favouriteProducts: FavouriteProducts,
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("password")
    @Expose
    var password: String,
    @SerializedName("phonenumber")
    @Expose
    var phonenumber: Phonenumber,
    @SerializedName("scope")
    @Expose
    var scope: String,
    @SerializedName("username")
    @Expose
    var username: String,
    @SerializedName("__v")
    @Expose
    var v: Int,
    @SerializedName("validation")
    @Expose
    var validation: Validation
)