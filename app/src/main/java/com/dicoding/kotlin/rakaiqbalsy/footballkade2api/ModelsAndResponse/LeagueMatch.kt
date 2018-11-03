package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse

import com.google.gson.annotations.SerializedName

data class LeagueMatch (
    @SerializedName("events") var eventResponses : List<EventResponse>
)