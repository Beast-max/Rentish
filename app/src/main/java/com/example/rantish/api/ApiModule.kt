package com.example.rantish.api

import com.example.rantish.api.Service.LoginService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
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

    val okHttpClient  = OkHttpClient.Builder()
        .readTimeout(140,TimeUnit.SECONDS)
        .connectTimeout(140,TimeUnit.SECONDS)
        .build()

    @Singleton
    @Provides
    fun provideRetrofit(gson:Gson):Retrofit.Builder=
            Retrofit.Builder()
                .baseUrl("https://rentish.onrender.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))

    @Singleton
    @Provides
    fun provideLoginService(retrofit: Retrofit.Builder): LoginService =
        retrofit
            .build()
            .create(LoginService::class.java)
}