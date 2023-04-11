package com.example.rantish.api.Service

import com.example.rantish.api.Request.*
import com.example.rantish.api.Response.CartResponse.AddToCartResponse
import com.example.rantish.api.Response.CartResponse.RemoveProductResponse
import com.example.rantish.api.Response.CreatePostRespone
import com.example.rantish.api.Response.GetAllResponse.GetAllResponse
import com.example.rantish.api.Response.GetFreeLancer.GetFreeLancerResponnse
import com.example.rantish.api.Response.GetSinglePost.GetSiglePostResponse
import com.example.rantish.api.Response.GetUser.GetUserResponse
import com.example.rantish.api.Response.LoginResponse.LoginResponse
import com.example.rantish.api.Response.PostResponse
import com.example.rantish.api.Response.SignUpResponse.SignUpResponse
import retrofit2.Response
import retrofit2.http.*

interface LoginService {
    @POST("app/v1/signup")
    suspend fun signUpUser(@Body signUprequest: SignUprequest): Response<SignUpResponse>

    @POST("app/v1/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest):Response<LoginResponse>

    @POST("app/v1/product")
    suspend fun getAllProduct():Response<PostResponse>

    @Headers("Authorization")
    @POST("app/v1/user/addtocart")
    suspend fun addProduct(@Body request:AddCartRequest):Response<AddToCartResponse>

    @Headers("Authorization")
    @POST("app/v1/user/removecart")
    suspend fun removeProductCart(@Body request: AddCartRequest):Response<RemoveProductResponse>

//    @POST("/app/v1/pay-order")
//    suspend fun checkOut(@Body request:CheckoutResponse):Response<>


    @GET("app/v1/user/get")
    suspend fun getUser(@Header("Authorization")token: String):Response<GetUserResponse>

    @POST("app/v1/post/add")
    suspend fun createPost(@Header("Authorization")token: String,@Body createPost: CreatePost):Response<CreatePostRespone>

    @GET("app/v1/post/getAll")
    suspend fun getAllPost(@Header("Authorization")token: String):Response<GetAllResponse>

    @GET("app/v1/post/get")
    suspend fun getSinglePost(@Header("Authorization")token: String,@Query("id")id:String):Response<GetSiglePostResponse>

    @GET("app/v1/user/freelancer/get")
    suspend fun getFreelancer(@Header("Authorization") token:String):Response<GetFreeLancerResponnse>
}