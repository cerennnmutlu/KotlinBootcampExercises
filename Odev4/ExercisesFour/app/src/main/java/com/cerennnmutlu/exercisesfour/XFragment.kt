package com.cerennnmutlu.exercisesfour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.cerennnmutlu.exercisesfour.databinding.FragmentXBinding

class XFragment : Fragment() {

    private lateinit var binding: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentXBinding.inflate(inflater, container, false)

        binding.btnGoToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yGecis) // X -> Y
        }

        return binding.root
    }


}