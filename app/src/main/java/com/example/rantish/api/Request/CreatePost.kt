package com.example.rantish.api.Request


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CreatePost(
    @SerializedName("description")
    @Expose
    var description: String,
    @SerializedName("pricePerDay")
    @Expose
    var pricePerDay: Int,
    @SerializedName("pricePerHour")
    @Expose
    var pricePerHour: Int,
    @SerializedName("title")
    @Expose
    var title: String
)