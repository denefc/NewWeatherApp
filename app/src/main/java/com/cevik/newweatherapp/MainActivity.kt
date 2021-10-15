package com.cevik.newweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.cevik.newweatherapp.adapter.WeatherPagerAdapter
import com.cevik.newweatherapp.view.FirstScreenFragment
import com.cevik.newweatherapp.view.SecondScreenFragment

class MainActivity : AppCompatActivity() {
    private  val fragmentList: ArrayList<Fragment> = arrayListOf()
    private lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         viewPager=findViewById(R.id.view_pager2)

        val firstFragment=FirstScreenFragment.newInstance()
        val secondFragment=SecondScreenFragment.newInstance()

        fragmentList.add(firstFragment)
        fragmentList.add(secondFragment)

        viewPager.adapter=WeatherPagerAdapter(fragmentList,this)



        //yapılacaklar viewPager oluşturmak sonrasında recyclerviewi falan fragmenta koymak
        //sonra 2. fragmentı oluşturmak
        //duruma göre 2. aktiviteyi oluşturup 5 günlük olanları oraya koymak


    }
}