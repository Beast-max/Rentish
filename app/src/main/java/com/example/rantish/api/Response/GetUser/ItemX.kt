package com.example.rantish.api.Response.GetUser


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ItemX(
    @SerializedName("_id")
    @Expose
    var id: String
)