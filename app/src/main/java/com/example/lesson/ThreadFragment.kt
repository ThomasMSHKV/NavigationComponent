package com.example.lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson.databinding.FragmentThreadBinding


class ThreadFragment : Fragment() {
    private var _binding: FragmentThreadBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThreadBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onStart() {
        super.onStart()
        binding.threadBtnBack.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_threadFragment_to_secondFragment)
        }
    }
}