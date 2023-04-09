package com.example.rantish.api.Response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class PostResponse(
    @SerializedName("data")
    @Expose
    var `data`: List<Data>,
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