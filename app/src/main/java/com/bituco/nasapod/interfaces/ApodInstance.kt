package com.bituco.nasapod.interfaces

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApodInstance {

    val api: ApodAPi by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.nasa.gov")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApodAPi::class.java)
    }
}