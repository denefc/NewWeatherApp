package com.cevik.newweatherapp.model

import androidx.annotation.DrawableRes

data class WeatherModel(
    @DrawableRes
    val logo:Int,
    val day:String,
    val status:String,
    val degree:String
)
