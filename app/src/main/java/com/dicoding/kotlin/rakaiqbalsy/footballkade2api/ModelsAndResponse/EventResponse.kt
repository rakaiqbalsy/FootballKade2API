package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class EventResponse (
    @SerializedName("idEvent") var idEvent : String?,
    @SerializedName("idSoccerXML") var idSoccerXML: String?,
    @SerializedName("strEvent") var strEvent : String?,
    @SerializedName("strSport") var strSport : String?,
    @SerializedName("idLeague") var idLeague : String?,
    @SerializedName("strSeason") var strSeason : String?,
    @SerializedName("strHomeTeam") var strHomeTeam : String?,
    @SerializedName("strAwayTeam") var strAwayTeam : String?,
    @SerializedName("intHomeScore") var intHomeScore : String?,
    @SerializedName("intRound") var intRound : String?,
    @SerializedName("intAwayScore") var intAwayScore : String?,
    @SerializedName("strHomeGoalDetails") var strHomeGoalDetails : String?,
    @SerializedName("strHomeRedCards") var strHomeRedCards : String?,
    @SerializedName("strHomeYellowCards") var strHomeYellowCards : String?,
    @SerializedName("strHomeLineupGoalKeeper") var strHomeLineupGoalKeeper : String?,
    @SerializedName("strHomeLineupDefense") var strHomeLineupDefense : String?,
    @SerializedName("strHomeLineupMidfield") var strHomeLineupMidfield : String?,
    @SerializedName("strHomeLineupForward") var strHomeLineupForward : String?,
    @SerializedName("strHomeLineupSubtitutes") var strHomeLineupSubtitutes : String?,
    @SerializedName("strHomeFormation") var strHomeFormation : String?,

    @SerializedName("strAwayGoalDetails") var strAwayGoalDetails : String?,
    @SerializedName("strAwayRedCards") var strAwayRedCards : String?,
    @SerializedName("strAwayYellowCards") var strAwayYellowCards : String?,
    @SerializedName("strAwayLineupGoalKeeper") var strAwayLineupGoalKeeper : String?,
    @SerializedName("strAwayLineupDefense") var strAwayLineupDefense : String?,
    @SerializedName("strAwayLineupMidfield") var strAwayLineupMidfield : String?,
    @SerializedName("strAwayLineupForward") var strAwayLineupForward : String?,
    @SerializedName("strAwayLineupSubtitutes") var strAwayLineupSubtitutes : String?,
    @SerializedName("strAwayFormation") var strAwayFormation : String?,

    @SerializedName("intHomeShots") var intHomeShots : String?,
    @SerializedName("intAwayShots") var intAwayShots : String?,
    @SerializedName("dateEvent") var dateEvent : String?,
    @SerializedName("strDate") var strDate : String?,
    @SerializedName("strTime") var strTime : String?,
    @SerializedName("idHomeTeam") var idHomeTeam : String?,
    @SerializedName("idAwayTeam") var idAwayTeam : String ?,
    @SerializedName("strLocked") var strLocked : String?
) : Parcelable