package com.example.adminnews.admin.ui.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.adminnews.R
import com.example.adminnews.databinding.FragmentUserWelcomeBinding

class UserWelcomeFragment : Fragment(R.layout.fragment_user_welcome) {
    private lateinit var binding: FragmentUserWelcomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentUserWelcomeBinding.inflate(layoutInflater)
        binding.loginButton1.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_userWelcomeFragment_to_userMobileNumberFragment)
        }
        return binding.root
    }
}