package com.example.flavorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flavorexample.BuildConfig

import com.example.flavorexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val baseUrl  = BuildConfig.BASE_URL

        binding.tvFlavorField.text = baseUrl

    }
}