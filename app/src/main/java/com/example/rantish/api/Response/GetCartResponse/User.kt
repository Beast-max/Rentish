package com.example.rantish.api.Response.GetCartResponse


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("address")
    @Expose
    var address: String,
    @SerialName("cart")
    @Expose
    var cart: Cart,
    @SerialName("email")
    @Expose
    var email: Email,
    @SerialName("favouriteProducts")
    @Expose
    var favouriteProducts: FavouriteProducts,
    @SerialName("_id")
    @Expose
    var id: String,
    @SerialName("password")
    @Expose
    var password: String,
    @SerialName("phonenumber")
    @Expose
    var phonenumber: Phonenumber,
    @SerialName("scope")
    @Expose
    var scope: String,
    @SerialName("username")
    @Expose
    var username: String,
    @SerialName("__v")
    @Expose
    var v: Int,
    @SerialName("validation")
    @Expose
    var validation: Validation
)