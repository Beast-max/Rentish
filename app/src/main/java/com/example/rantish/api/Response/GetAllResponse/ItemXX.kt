package com.example.rantish.api.Response.GetAllResponse


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ItemXX(
    @SerializedName("_id")
    @Expose
    var id: String
)