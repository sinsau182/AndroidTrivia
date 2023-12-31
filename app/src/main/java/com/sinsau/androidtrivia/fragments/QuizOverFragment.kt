package com.sinsau.androidtrivia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sinsau.androidtrivia.R
import com.sinsau.androidtrivia.databinding.FragmentQuizOverBinding

class QuizOverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentQuizOverBinding>(inflater,
        R.layout.fragment_quiz_over, container, false)

        binding.retry.setOnClickListener {
            it.findNavController().navigate(R.id.action_quizOverFragment_to_quizFragment)
        }

        return binding.root
    }

}