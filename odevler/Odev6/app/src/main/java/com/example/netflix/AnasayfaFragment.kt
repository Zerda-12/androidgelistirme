package com.example.netflix

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netflix.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private var _binding: FragmentAnasayfaBinding? = null
    private val binding get() = _binding!!

    // Film listeleri (şimdilik aynı resimleri tekrar kullandık)
    private val populerMovies = listOf(
        Movie(R.drawable.wednesday),
        Movie(R.drawable.lacasadepapel),
        Movie(R.drawable.dunyasavasi)

        )

    private val yeniMovies = listOf(
        Movie(R.drawable.candostum),
        Movie(R.drawable.trainbusan),
        Movie(R.drawable.lacasadepapel)


        )

    private val onerilenMovies = listOf(
        Movie(R.drawable.dunyasavasi),
        Movie(R.drawable.zindanadasi),
        Movie(R.drawable.trainbusan)
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Popüler filmler RecyclerView — Yatay liste
        binding.rvPopulerMovies.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvPopulerMovies.adapter = MovieAdapter(populerMovies)

        // Yeni eklenen filmler RecyclerView — Yatay liste
        binding.rvYeniMovies.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvYeniMovies.adapter = MovieAdapter(yeniMovies)

        // Önerilen filmler RecyclerView — Yatay liste
        binding.rvOnerilenMovies.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvOnerilenMovies.adapter = MovieAdapter(onerilenMovies)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
