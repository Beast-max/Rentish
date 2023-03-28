package com.example.rantish.api.Service

import com.example.rantish.api.Request.LoginRequest
import com.example.rantish.api.Request.SignUprequest
import com.example.rantish.api.Response.LoginResponse.LoginResponse
import com.example.rantish.api.Response.SignUpResponse.SignUpResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("/app/v1/signup")
    suspend fun signUpUser(@Body signUprequest: SignUprequest): Response<SignUpResponse>

    @POST("/app/v1/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest):Response<LoginResponse>

}