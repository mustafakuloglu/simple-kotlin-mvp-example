package com.kuloglu.kotlinmvp.api

import com.kuloglu.kotlinmvp.model.Animal
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DogApi {
        @GET("dog.php")
    fun listRepo(@Query("limit") limit:Int):Call<Animal>
}