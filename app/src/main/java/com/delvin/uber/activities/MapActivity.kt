package com.delvin.uber.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.delvin.uber.R
import com.delvin.uber.databinding.ActivityMapBinding
import com.delvin.uber.databinding.ActivityRegisterBinding

class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}