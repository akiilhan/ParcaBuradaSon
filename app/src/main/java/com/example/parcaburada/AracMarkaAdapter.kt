package com.example.parcaburada

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.arac_kategori.view.*

class AracMarkaAdapter(private val tumKategori: ArrayList<AracMarka>,
                       private val context: Context
) : //Added context parameter
    RecyclerView.Adapter<AracMarkaAdapter.AracMarkaViewHolder>() {

    private val itemClickListener = context as MyItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AracMarkaViewHolder {

        var inflater = LayoutInflater.from(parent.context)
        var arackategori = inflater.inflate(R.layout.arac_kategori, parent, false)
        arackategori.setOnClickListener {


        }

        val aracViewHolder = AracMarkaViewHolder(arackategori)    ///Added this
        arackategori.setOnClickListener {
            itemClickListener.userItemClick(aracViewHolder.adapterPosition)
        }

        return aracViewHolder
    }

    override fun getItemCount(): Int {
        return tumKategori.size
    }

    override fun onBindViewHolder(holder: AracMarkaViewHolder, position: Int) {


        holder.aracismi.text = tumKategori.get(position).aracAdi
        holder.aracLogo.setImageResource(tumKategori.get(position).aracLogo)
        holder.teksatirKategori.setTag(holder)


    }


    class AracMarkaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        var teksatirKategori = itemView
        var aracismi = teksatirKategori.tvaracAdi
        var aracLogo = teksatirKategori.img_arac_sembol


    }
}