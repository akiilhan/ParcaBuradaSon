package com.example.parcaburada.ui.kategori

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is kategori Fragment"
    }
    val text: LiveData<String> = _text
}