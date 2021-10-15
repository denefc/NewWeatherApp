package com.cevik.newweatherapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cevik.newweatherapp.model.WeatherModel
import com.cevik.newweatherapp.R

class WeatherAdapter :RecyclerView.Adapter<WeatherHolder>(){

    var weathersList:List<WeatherModel> = arrayListOf()
    set(value) {
        field=value
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherHolder {
       val itemView=LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_status,parent,false)
        return WeatherHolder(itemView)
    }

    override fun onBindViewHolder(holder: WeatherHolder, position: Int) {
        holder.bind(weathersList[position])
    }

    override fun getItemCount(): Int =weathersList.size
}