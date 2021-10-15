package com.cevik.newweatherapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cevik.newweatherapp.model.WeatherModel
import com.cevik.newweatherapp.R

class WeatherHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    fun bind(model:WeatherModel){
        val logo=itemView.findViewById<ImageView>(R.id.logo)
        val dayText=itemView.findViewById<TextView>(R.id.day_text)
        val statusText=itemView.findViewById<TextView>(R.id.status_text)
        val degreeText=itemView.findViewById<TextView>(R.id.degree_text)

        logo.setImageResource(model.logo)
        dayText.text=model.day
        statusText.text=model.status
        degreeText.text=model.degree


    }
}