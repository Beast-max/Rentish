package com.example.rantish.api.Request


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CheckoutResponse(
    @SerializedName("amount")
    @Expose
    var amount: String,
    @SerializedName("razorpayOrderId")
    @Expose
    var razorpayOrderId: String,
    @SerializedName("razorpayPaymentId")
    @Expose
    var razorpayPaymentId: String,
    @SerializedName("razorpaySignature")
    @Expose
    var razorpaySignature: String
)