package com.example.netflix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.netflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // Binding nesnesi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding ile layout inflate et
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}
