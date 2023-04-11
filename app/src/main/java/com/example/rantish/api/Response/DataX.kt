package com.example.rantish.api.Response


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class DataX(
    @SerializedName("createdAt")
    @Expose
    var createdAt: String,
    @SerializedName("description")
    @Expose
    var description: String,
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("image")
    @Expose
    var image: List<Any>,
    @SerializedName("isValid")
    @Expose
    var isValid: Boolean,
    @SerializedName("pricePerDay")
    @Expose
    var pricePerDay: Int,
    @SerializedName("pricePerHour")
    @Expose
    var pricePerHour: Int,
    @SerializedName("status")
    @Expose
    var status: Status,
    @SerializedName("title")
    @Expose
    var title: String,
    @SerializedName("updatedAt")
    @Expose
    var updatedAt: String,
    @SerializedName("userId")
    @Expose
    var userId: String,
    @SerializedName("__v")
    @Expose
    var v: Int
)