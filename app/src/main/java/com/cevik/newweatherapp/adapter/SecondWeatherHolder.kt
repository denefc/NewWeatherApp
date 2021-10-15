package com.cevik.newweatherapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cevik.newweatherapp.R
import com.cevik.newweatherapp.model.SecondWeatherModel

class SecondWeatherHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    fun bind(model:SecondWeatherModel){
        val secondDayText=itemView.findViewById<TextView>(R.id.secondDayText)
        val seconDegreeText=itemView.findViewById<TextView>(R.id.secondDegree)
        val secondLogo=itemView.findViewById<ImageView>(R.id.secondLogo)

        secondDayText.text=model.dayTime
        seconDegreeText.text=model.degree
        secondLogo.setImageResource(model.logo)
    }

}