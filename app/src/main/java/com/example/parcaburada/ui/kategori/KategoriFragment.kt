package com.example.parcaburada.ui.kategori

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcaburada.AracMarka
import com.example.parcaburada.AracMarkaAdapter
import com.example.parcaburada.R
import kotlinx.android.synthetic.main.fragment_category.*
import java.lang.Integer.min
import java.util.ArrayList

class KategoriFragment : Fragment() {
    var araclarKategori = ArrayList<AracMarka>()


    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        veriKaynaginiDoldur()
        galleryViewModel =
          ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        var root = inflater.inflate(R.layout.fragment_category, container, false)

        var rvarackategori = root.findViewById(R.id.rvarackategori) as RecyclerView
        var MyAdapter = AracMarkaAdapter(araclarKategori,requireContext())
        rvarackategori.adapter = MyAdapter

var linearLayoutManager=LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        rvarackategori.layoutManager=linearLayoutManager

        return root
    }

    fun veriKaynaginiDoldur(): ArrayList<AracMarka> {

        var aracLogo = arrayOf(R.drawable.opellogo, R.drawable.chevroletlogo)
        var aracismi = resources.getStringArray(R.array.arabaisim)

        for (i in 0 until min(aracismi.size, aracLogo.size)) {

            var eklenecekaracKategori = AracMarka(aracismi[i], aracLogo[i])
            araclarKategori.add(eklenecekaracKategori)
        }
        return araclarKategori

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }


}