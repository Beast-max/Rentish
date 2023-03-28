package com.example.rantish.repository

import com.example.rantish.api.Request.LoginRequest
import com.example.rantish.api.Request.SignUprequest
import com.example.rantish.api.Response.LoginResponse.LoginResponse
import com.example.rantish.api.Response.SignUpResponse.SignUpResponse
import com.example.rantish.api.Service.LoginService
import retrofit2.Response

class LoginRepoitory(
    private val loginService:LoginService
){
    suspend fun loginUser(loginRequest: LoginRequest):Response<LoginResponse>{
        return loginService.loginUser(loginRequest)
    }
    suspend fun signUpUser(signUprequest: SignUprequest):Response<SignUpResponse>{
        return loginService.signUpUser(signUprequest)
    }
}