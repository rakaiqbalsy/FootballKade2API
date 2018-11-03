package com.dicoding.kotlin.rakaiqbalsy.footballkade2api.ModelsAndResponse

import com.google.gson.annotations.SerializedName

data class Teams (
    @SerializedName("teams") var team : List<TeamsResponse>
)