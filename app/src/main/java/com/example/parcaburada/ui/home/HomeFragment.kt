package com.example.parcaburada.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.parcaburada.R
import android.graphics.Color
import androidx.core.view.get
import androidx.core.view.marginTop
import com.smarteist.autoimageslider.SliderView
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController
import com.smarteist.autoimageslider.SliderAnimations


class HomeFragment : Fragment() {


    private lateinit var homeViewModel: HomeViewModel

    internal lateinit var sliderView: SliderView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        sliderView = root.findViewById(R.id.imageSlider)
        imageslader()

        return root
    }

    fun imageslader() {

        val adapter = SliderAdapterExample(context!!)
        adapter.count = 7
        sliderView.sliderAdapter = adapter
        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION)
        sliderView.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        sliderView.indicatorSelectedColor = Color.WHITE
        sliderView.indicatorUnselectedColor = Color.GRAY
        sliderView.startAutoCycle()

        sliderView.setOnIndicatorClickListener { position ->
            sliderView.currentPagePosition = position
        }

    }


}