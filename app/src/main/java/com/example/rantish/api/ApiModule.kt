package com.example.rantish.api

import com.example.rantish.api.Service.LoginService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Singleton
    @Provides
    fun provideGsonBuilder():Gson=
        GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()


    @Singleton
    @Provides
    fun provideRetrofit(gson:Gson):Retrofit.Builder=
            Retrofit.Builder()
                .baseUrl("https://rentish.onrender.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))

    @Singleton
    @Provides
    fun provideLoginService(retrofit: Retrofit.Builder): LoginService =
        retrofit
            .build()
            .create(LoginService::class.java)
}