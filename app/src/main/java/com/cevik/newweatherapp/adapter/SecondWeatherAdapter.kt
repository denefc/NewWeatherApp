package com.cevik.newweatherapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cevik.newweatherapp.R
import com.cevik.newweatherapp.model.SecondWeatherModel

class SecondWeatherAdapter:RecyclerView.Adapter<SecondWeatherHolder>() {
    var weathersList:List<SecondWeatherModel> = arrayListOf()
        set(value) {
            field=value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondWeatherHolder {
        val itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_second_weather,parent,false)
        return SecondWeatherHolder(itemView)
    }

    override fun onBindViewHolder(holder: SecondWeatherHolder, position: Int) {
        holder.bind(weathersList[position])
    }

    override fun getItemCount(): Int =weathersList.size

}