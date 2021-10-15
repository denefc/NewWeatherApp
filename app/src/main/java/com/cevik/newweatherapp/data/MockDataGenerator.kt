package com.cevik.newweatherapp.data

import com.cevik.newweatherapp.model.WeatherModel
import com.cevik.newweatherapp.R
import com.cevik.newweatherapp.model.SecondWeatherModel

class MockDataGenerator {

    fun generateWeatherList():List<WeatherModel>{
        val weatherList= arrayListOf<WeatherModel>()

        val weather1=WeatherModel(
            logo= R.drawable.cloudy,
            day="Today",
            status = "Cloudy",
            degree = "21°/5°"

        )
        val weather2=WeatherModel(
            logo= R.drawable.rainy,
            day="Tomorrow",
            status = "Rainy",
            degree = "21°/5°"

        )
        val weather3=WeatherModel(
            logo= R.drawable.sunny,
            day="Saturday",
            status = "Cloudy",
            degree = "21°/5°"

        )

        weatherList.add(weather1)
        weatherList.add(weather2)
        weatherList.add(weather3)

     return weatherList

    }

    fun generateSecondWeatherList():List<SecondWeatherModel>{
        val weatherList= arrayListOf<SecondWeatherModel>()

        val weather1=SecondWeatherModel(
            dayTime ="Now",
            degree = "16°C",
            logo = R.drawable.sunny
        )
        val weather2=SecondWeatherModel(
            dayTime ="14:00",
            degree = "17°C",
            logo = R.drawable.cloudy
        )
        val weather3=SecondWeatherModel(
            dayTime ="15:00",
            degree = "18°C",
            logo = R.drawable.cloudy
        )
        val weather4=SecondWeatherModel(
            dayTime ="16:00",
            degree = "20°C",
            logo = R.drawable.rainy
        )
        val weather5=SecondWeatherModel(
            dayTime ="17:00",
            degree = "22°C",
            logo = R.drawable.thunder
        )
        val weather6=SecondWeatherModel(
            dayTime ="18:00",
            degree = "11°C",
            logo = R.drawable.stormy
        )
        weatherList.add(weather1)
        weatherList.add(weather2)
        weatherList.add(weather3)
        weatherList.add(weather4)
        weatherList.add(weather5)
        weatherList.add(weather6)

        return weatherList


    }

}