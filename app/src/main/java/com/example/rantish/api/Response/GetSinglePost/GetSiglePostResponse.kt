package com.example.rantish.api.Response.GetSinglePost


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class GetSiglePostResponse(
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