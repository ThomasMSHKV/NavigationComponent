package com.example.lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onStart() {
        super.onStart()
        binding.secondBtnNext.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_threadFragment)
        }
        binding.secondBtnBack.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment )
        }

    }
}