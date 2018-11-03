package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse

import io.reactivex.Flowable

interface MatchRepo {
    fun getMatchSoccer(id: String) : Flowable<LeagueMatch>
    fun getTeams(id: String= "0") : Flowable<Teams>
    fun getNextMatch(id: String) : Flowable<LeagueMatch>
    fun getEvent(id: String) : Flowable<LeagueMatch>
}