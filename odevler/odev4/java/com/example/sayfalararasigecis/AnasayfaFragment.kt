package com.example.sayfalararasigecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfalararasigecis.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)//ViewBindingi başlat


        binding.buttonA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_AFragment) // AFragment'e geçiş
        }

        // Button X'e tıklanma olayını dinle
        binding.buttonx.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_XFragment) // XFragment'e geçiş
        }

        return binding.root
    }
}
