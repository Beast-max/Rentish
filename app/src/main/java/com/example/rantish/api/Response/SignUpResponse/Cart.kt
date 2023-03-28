package com.example.rantish.api.Response.SignUpResponse


import com.google.gson.annotations.SerializedName

data class Cart(
    @SerializedName("items")
    var items: List<Any>
)