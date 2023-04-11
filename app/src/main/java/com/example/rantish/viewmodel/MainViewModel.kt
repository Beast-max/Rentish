package com.example.rantish.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
import com.example.rantish.repository.LoginRepoitory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repo:LoginRepoitory):ViewModel() {
     val signUpLiveData = MutableLiveData<SignUpResponse>()
     val loginLiveData = MutableLiveData<LoginResponse>()
    val allProduct = MutableLiveData<PostResponse>()
    val addProductResponse = MutableLiveData<AddToCartResponse>()
    val getUserResponse = MutableLiveData<GetUserResponse>()
    val getAll = MutableLiveData<GetAllResponse>()
    val getAllSinglePost = MutableLiveData<GetSiglePostResponse>()
    val getFreeLancerResponnse = MutableLiveData<GetFreeLancerResponnse>()

    fun signup(email:String,username:String,password:String,phonenumber:String,address:String) = viewModelScope.launch {
        val request = SignUprequest(address,email,password,phonenumber,"user",username)
        val response = repo.signUpUser(request)
        if(response.code()==200){
            signUpLiveData.postValue(response.body())
        }
    }
    fun login(loginRequest: LoginRequest) = viewModelScope.launch {
        val response = repo.loginUser(loginRequest)
        Log.d("request_login",loginRequest.toString())
        if(response.code()==200){
            loginLiveData.postValue(response.body())
        }
    }
    fun getAllProduct() = viewModelScope.launch {
        val response = repo.getProduct()
        if(response.code()==200){
            allProduct.postValue(response.body())
        }
    }
    fun addProduct(id:String) = viewModelScope.launch {
        val response = repo.addProduct(id)
        if(response.code()==200){
            addProductResponse.postValue(response.body())
        }
    }

    fun getAllUser() = viewModelScope.launch {
        val response = repo.getUser()
        if(response.code()==200){
            getUserResponse.postValue(response.body())
        }
    }
    fun createPost(name:String,dis:String,hours:Int,price:Int) = viewModelScope.launch {
        val reuest = CreatePost(dis,price,hours,name)
        val response = repo.createPost(reuest)


    }

    fun getAllPost() = viewModelScope.launch {
        val response = repo.getAll()
        if(response.code()==200){
            getAll.postValue(response.body())
        }
    }
    fun getSinglePost(idString: String) = viewModelScope.launch {
        val response = repo.getSignlePost(idString)
        if(response.code()==200){
            getAllSinglePost.postValue(response.body())
        }
    }
    fun getFreeLancer(token:String)  = viewModelScope.launch {
        val response = repo.getFreeLancer(token)
        if(response.code()==200){
            getFreeLancerResponnse.postValue(response.body())
        }
    }

}