package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse

import com.dicoding.kotlin.rakaiqbalsy.footballkade2api.RestFullApi.EndPoint
import io.reactivex.Flowable

class MatchRest (private val soccerRestfull : EndPoint) : MatchRepo {
    override fun getTeams(id: String): Flowable<Teams> = soccerRestfull.getTeam(id)

    override fun getEvent(id: String): Flowable<LeagueMatch> = soccerRestfull.getEvent(id)

    override fun getNextMatch(id: String): Flowable<LeagueMatch> = soccerRestfull.getNextMatch(id)

    override fun getMatchSoccer(id: String): Flowable<LeagueMatch> = soccerRestfull.getpastMatch(id)
}