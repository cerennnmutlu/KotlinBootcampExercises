package com.cerennnmutlu.exercisesfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cerennnmutlu.exercisesfour.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.btnGoToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.aGecis)
        }

        binding.btnGoToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xGecis)
        }

        return binding.root

    }


}