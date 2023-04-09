package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ItemX(
    @SerializedName("_id")
    @Expose
    var id: String
)