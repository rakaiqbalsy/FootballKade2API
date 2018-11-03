package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.RestFullApi

import com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse.LeagueMatch
import com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse.Teams
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface EndPoint {
    @GET("eventspastleague.php?")
    fun getpastMatch(@Query("id") id:String) : Flowable<LeagueMatch>

    @GET("eventsnextleague.php")
    fun getNextMatch(@Query("id") id:String) : Flowable<LeagueMatch>

    @GET("lookupteam.php")
    fun getTeam(@Query("id") id:String) : Flowable<Teams>

    @GET("lookupevent.php")
    fun getEvent(@Query("id") id:String) : Flowable<LeagueMatch>
}