package com.example.rantish.api.Response.GetUser


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Data(
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