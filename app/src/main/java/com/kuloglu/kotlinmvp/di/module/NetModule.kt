package com.kuloglu.kotlinmvp.di.module

import android.content.Context
import com.kuloglu.kotlinmvp.AppDog
import com.kuloglu.kotlinmvp.api.DogApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(var app:AppDog) {
    @Provides
    @Singleton
    fun provideApp(): AppDog = app


    @Provides
    @Singleton
    fun provideContext(): Context = app.applicationContext


    @Provides
    @Singleton
    fun provideOkhttp():Retrofit = Retrofit.Builder().baseUrl("https://api.thedogapi.co.uk/v2/").addConverterFactory(GsonConverterFactory.create()).build()

    @Provides
    @Singleton
    fun provideDogService(retrofit: Retrofit):DogApi=retrofit.create(DogApi::class.java)
}