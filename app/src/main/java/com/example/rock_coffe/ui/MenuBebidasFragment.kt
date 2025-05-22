package com.example.rock_coffe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rock_coffe.R
import com.example.rock_coffe.databinding.FragmentMenuBebidasBinding

class MenuBebidasFragment : Fragment() {

    private var _binding: FragmentMenuBebidasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBebidasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cafes = listOf(
            Cafe(getString(R.string.cafe_1_nombre), getString(R.string.cafe_1_desc), getString(R.string.cafe_1_precio), R.drawable.cafe_1),
            Cafe(getString(R.string.cafe_2_nombre), getString(R.string.cafe_2_desc), getString(R.string.cafe_2_precio), R.drawable.cafe_2),
            Cafe(getString(R.string.cafe_3_nombre), getString(R.string.cafe_3_desc), getString(R.string.cafe_3_precio), R.drawable.cafe_3),
            Cafe(getString(R.string.cafe_4_nombre), getString(R.string.cafe_4_desc), getString(R.string.cafe_4_precio), R.drawable.cafe_4),
            Cafe(getString(R.string.cafe_5_nombre), getString(R.string.cafe_5_desc), getString(R.string.cafe_5_precio), R.drawable.cafe_5),
            Cafe(getString(R.string.cafe_6_nombre), getString(R.string.cafe_6_desc), getString(R.string.cafe_6_precio), R.drawable.cafe_6),
            Cafe(getString(R.string.cafe_7_nombre), getString(R.string.cafe_7_desc), getString(R.string.cafe_7_precio), R.drawable.cafe_7),
            Cafe(getString(R.string.cafe_8_nombre), getString(R.string.cafe_8_desc), getString(R.string.cafe_8_precio), R.drawable.cafe_8),
            Cafe(getString(R.string.cafe_9_nombre), getString(R.string.cafe_9_desc), getString(R.string.cafe_9_precio), R.drawable.cafe_9),
            Cafe(getString(R.string.cafe_10_nombre), getString(R.string.cafe_10_desc), getString(R.string.cafe_10_precio), R.drawable.cafe_10)
        )

        binding.recyclerBebidas.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerBebidas.adapter = CafeAdapter(cafes) { cafe ->
            Toast.makeText(requireContext(), "Agregado: ${cafe.nombre}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}