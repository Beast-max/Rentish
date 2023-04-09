package com.example.rantish.api.Request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AddCartRequest(
    @SerializedName("productId")
    @Expose
    val id:String)