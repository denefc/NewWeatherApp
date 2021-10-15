package com.cevik.newweatherapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WeatherPagerAdapter(private val fragmentList:List<Fragment>,fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {


    override fun getItemCount(): Int=fragmentList.size

    override fun createFragment(position: Int):Fragment=fragmentList[position]
}