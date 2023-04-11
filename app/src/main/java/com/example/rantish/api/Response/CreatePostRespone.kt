package com.example.rantish.api.Response


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CreatePostRespone(
    @SerializedName("data")
    @Expose
    var `data`: List<DataX>,
    @SerializedName("message")
    @Expose
    var message: String,
    @SerializedName("statusCode")
    @Expose
    var statusCode: Int,
    @SerializedName("type")
    @Expose
    var type: String
)