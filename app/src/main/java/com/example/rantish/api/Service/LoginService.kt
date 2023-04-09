package com.example.rantish.api.Service

import com.example.rantish.api.Request.AddCartRequest
import com.example.rantish.api.Request.LoginRequest
import com.example.rantish.api.Request.SignUprequest
import com.example.rantish.api.Response.CartResponse.AddToCartResponse
import com.example.rantish.api.Response.CartResponse.RemoveProductResponse
import com.example.rantish.api.Response.LoginResponse.LoginResponse
import com.example.rantish.api.Response.PostResponse
import com.example.rantish.api.Response.SignUpResponse.SignUpResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("app/v1/signup")
    suspend fun signUpUser(@Body signUprequest: SignUprequest): Response<SignUpResponse>

    @POST("app/v1/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest):Response<LoginResponse>

    @POST("app/v1/product")
    suspend fun getAllProduct():Response<PostResponse>

    @POST("app/v1/user/addtocart")
    suspend fun addProduct(@Body request:AddCartRequest):Response<AddToCartResponse>

    @POST("app/v1/user/removecart")
    suspend fun removeProductCart(@Body request: AddCartRequest):Response<RemoveProductResponse>

}