package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.RestFullApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    companion object {
        fun getService() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com/api/v1/json/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}