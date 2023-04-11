package com.example.rantish.repository

import com.example.rantish.Extensions.Token
import com.example.rantish.api.Request.AddCartRequest
import com.example.rantish.api.Request.CreatePost
import com.example.rantish.api.Request.LoginRequest
import com.example.rantish.api.Request.SignUprequest
import com.example.rantish.api.Response.CartResponse.AddToCartResponse
import com.example.rantish.api.Response.CreatePostRespone
import com.example.rantish.api.Response.GetAllResponse.GetAllResponse
import com.example.rantish.api.Response.GetFreeLancer.GetFreeLancerResponnse
import com.example.rantish.api.Response.GetSinglePost.GetSiglePostResponse
import com.example.rantish.api.Response.GetUser.GetUserResponse
import com.example.rantish.api.Response.LoginResponse.LoginResponse
import com.example.rantish.api.Response.PostResponse
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

    suspend fun getProduct():Response<PostResponse>{
        return loginService.getAllProduct()
    }

    suspend fun addProduct(id:String):Response<AddToCartResponse>{
        return loginService.addProduct(AddCartRequest(id))
    }

    suspend fun getUser():Response<GetUserResponse>{
        return loginService.getUser(Token.token)
    }
    suspend fun createPost(createPost: CreatePost):Response<CreatePostRespone>{
        return loginService.createPost(Token.token,createPost)
    }

    suspend fun getAll():Response<GetAllResponse>{
        return loginService.getAllPost(Token.token)
    }

    suspend fun getSignlePost(id: String):Response<GetSiglePostResponse>{
        return loginService.getSinglePost(id,Token.token)
    }

    suspend fun getFreeLancer(token:String):Response<GetFreeLancerResponnse>{
        return loginService.getFreelancer(token)
    }
}