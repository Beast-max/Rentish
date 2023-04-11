package com.example.rantish.api.Response.GetAllResponse


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Validation(
    @SerializedName("documentnumber")
    @Expose
    var documentnumber: String,
    @SerializedName("documenttype")
    @Expose
    var documenttype: String
)