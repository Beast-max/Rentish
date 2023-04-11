package com.example.rantish.api.Response.GetAllResponse


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Item(
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("isAccepted")
    @Expose
    var isAccepted: Boolean,
    @SerializedName("user")
    @Expose
    var user: User
)