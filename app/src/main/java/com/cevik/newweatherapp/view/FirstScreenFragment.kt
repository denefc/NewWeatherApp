package com.cevik.newweatherapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cevik.newweatherapp.R
import com.cevik.newweatherapp.adapter.WeatherAdapter
import com.cevik.newweatherapp.data.MockDataGenerator

class FirstScreenFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.fragment_first_screen, container, false)
        val rvList=rootView.findViewById<RecyclerView>(R.id.rvList)

        val adapter= WeatherAdapter()

        adapter.weathersList= MockDataGenerator().generateWeatherList()

        rvList.adapter=adapter
        rvList.layoutManager= LinearLayoutManager(this.context, RecyclerView.VERTICAL,false)
        return rootView
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            FirstScreenFragment().apply {

            }
    }
}