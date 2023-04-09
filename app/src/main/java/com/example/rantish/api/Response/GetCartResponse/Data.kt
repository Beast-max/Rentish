package com.example.rantish.api.Response.GetCartResponse


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class Data(
    @SerializedName("total")
    @Expose
    var total: Int,
    @SerializedName("user")
    @Expose
    var user: User
)