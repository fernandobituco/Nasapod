package com.bituco.nasapod.interfaces

import com.bituco.nasapod.models.ApodModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApodAPi {

    @GET("/planetary/apod")
    suspend fun getApod(@Query("api_key") key: String): Response <ApodModel>
}