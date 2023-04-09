package com.example.rantish.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rantish.api.Request.LoginRequest
import com.example.rantish.api.Request.SignUprequest
import com.example.rantish.api.Response.LoginResponse.LoginResponse
import com.example.rantish.api.Response.SignUpResponse.SignUpResponse
import com.example.rantish.repository.LoginRepoitory
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(val repo:LoginRepoitory):ViewModel() {
     val signUpLiveData = MutableLiveData<SignUpResponse>()
     val loginLiveData = MutableLiveData<LoginResponse>()
    

    fun signup(email:String,username:String,password:String,phonenumber:String,address:String) = viewModelScope.launch {
        val request = SignUprequest(address,email,password,phonenumber,"user",username)
        val response = repo.signUpUser(request)
        if(response.code()==200){
            signUpLiveData.postValue(response.body())
        }
    }
    fun login(email: String,password: String) = viewModelScope.launch {
        val request = LoginRequest(email,password)
        val response = repo.loginUser(request)
        if(response.code()==200){
            loginLiveData.postValue(response.body())
        }
    }
}