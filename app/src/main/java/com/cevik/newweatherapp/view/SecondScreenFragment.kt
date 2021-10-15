package com.cevik.newweatherapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cevik.newweatherapp.R
import com.cevik.newweatherapp.adapter.SecondWeatherAdapter
import com.cevik.newweatherapp.adapter.WeatherAdapter
import com.cevik.newweatherapp.data.MockDataGenerator


class SecondScreenFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.fragment_second_screen, container, false)
        val rvList=rootView.findViewById<RecyclerView>(R.id.rvList2)

        val adapter= SecondWeatherAdapter()

        adapter.weathersList= MockDataGenerator().generateSecondWeatherList()

        rvList.adapter=adapter
        rvList.layoutManager= LinearLayoutManager(this.context, RecyclerView.HORIZONTAL,false)
        return rootView
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SecondScreenFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}