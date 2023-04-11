package com.example.rantish.api.Response.GetFreeLancer


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Data(
    @SerializedName("category")
    @Expose
    var category: String,
    @SerializedName("expectedIncome")
    @Expose
    var expectedIncome: Int,
    @SerializedName("facebookUrl")
    @Expose
    var facebookUrl: String,
    @SerializedName("_id")
    @Expose
    var id: String,
    @SerializedName("instagramUrl")
    @Expose
    var instagramUrl: String,
    @SerializedName("linkedInUrl")
    @Expose
    var linkedInUrl: String,
    @SerializedName("review")
    @Expose
    var review: Review,
    @SerializedName("skills")
    @Expose
    var skills: List<Any>,
    @SerializedName("user")
    @Expose
    var user: User,
    @SerializedName("__v")
    @Expose
    var v: Int
)