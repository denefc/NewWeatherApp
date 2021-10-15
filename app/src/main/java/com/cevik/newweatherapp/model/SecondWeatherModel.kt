package com.cevik.newweatherapp.model

import androidx.annotation.DrawableRes

data class SecondWeatherModel(
    val dayTime:String,
    val degree:String,
    @DrawableRes
    val logo:Int
)