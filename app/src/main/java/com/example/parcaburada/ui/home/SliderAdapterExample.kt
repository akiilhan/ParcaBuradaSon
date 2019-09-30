package com.example.parcaburada.ui.home

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.manager.RequestManagerRetriever
import com.example.parcaburada.R
import com.smarteist.autoimageslider.SliderViewAdapter

internal class SliderAdapterExample(private val context: Context) : SliderViewAdapter<SliderAdapterExample.SliderAdapterVH>() {
    private var mCount: Int = 0

    fun setCount(count: Int) {
        this.mCount = count
    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.image_slider_layout_item, null)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH, position: Int) {


        //viewHolder.itemView.setOnClickListener(View.OnClickListener { Toast.makeText(context, "This is item in position $position", Toast.LENGTH_SHORT).show() })


        when (position) {
            0 -> {
                //viewHolder.textViewDescription.text = "This is slider item $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-04.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            1 -> {
                //viewHolder.textViewDescription.text = "This is slider item $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-03.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            2 -> {
                //viewHolder.textViewDescription.text = "This is slider item $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-01.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            3 -> {
                //viewHolder.textViewDescription.text = "This is slider item $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-05.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            4 -> {
                //viewHolder.textViewDescription.text = "This is slider item $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-06.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            5 -> {
                //viewHolder.textViewDescription.text = "This is slider item $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-03.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            6 -> {
                //viewHolder.textViewDescription.text = "deneme $position"
                viewHolder.textViewDescription.textSize = 16f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.imageGifContainer.visibility = View.GONE
                Glide.with(viewHolder.itemView)
                        .load("https://www.parcaburada.com/public/images/sliders/slider-02.jpg")
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
            }
            /**else -> {
                viewHolder.textViewDescription.textSize = 29f
                viewHolder.textViewDescription.setTextColor(Color.WHITE)
                viewHolder.textViewDescription.text = "Ohhhh! look at this!"
                viewHolder.imageGifContainer.visibility = View.VISIBLE
                Glide.with(viewHolder.itemView)
                        .load(R.drawable.puma_offer)
                        .fitCenter()
                        .into(viewHolder.imageViewBackground)
                Glide.with(viewHolder.itemView)
                        .asGif()
                        .load(R.drawable.oh_look_at_this)
                        .into(viewHolder.imageGifContainer)
            }*/
        }

    }

    override fun getCount(): Int {
        //slider view count could be dynamic size
        return mCount
    }

    internal inner class SliderAdapterVH(var itemView: View) : SliderViewAdapter.ViewHolder(itemView) {
        var imageViewBackground: ImageView
        var imageGifContainer: ImageView
        var textViewDescription: TextView

        init {
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider)
            imageGifContainer = itemView.findViewById(R.id.iv_gif_container)
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider)
        }
    }


}
