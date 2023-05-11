package com.example.fragmentslearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentslearn.databinding.ActivityCardViewerBinding



class CardViewer : AppCompatActivity() {
    private lateinit var binding : ActivityCardViewerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}