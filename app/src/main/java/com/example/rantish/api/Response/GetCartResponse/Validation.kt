package com.example.rantish.api.Response.GetCartResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Validation(
    @SerializedName("documentnumber")
    @Expose
    var documentnumber: String,
    @SerializedName("documenttype")
    @Expose
    var documenttype: String
)