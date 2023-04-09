package com.example.rantish.api

import com.example.rantish.api.Service.LoginService
import com.example.rantish.repository.LoginRepoitory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object di {
    @Singleton
    @Provides
    fun provideService(service: LoginService): LoginRepoitory = LoginRepoitory(service)
}