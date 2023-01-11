package com.example.adminnews.admin.ui.ui.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.adminnews.admin.ui.Repository.ExclusiveNewsRepositoryImpl
import com.example.adminnews.admin.ui.ui.fragments.viewmodel.ExclusiveNewsViewModel
import com.example.adminnews.admin.ui.ui.fragments.viewmodel.ExclusiveNewsViewModelProviderFactory
import com.example.adminnews.databinding.ActivityExclusiveNewsBinding

class ExclusiveNewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExclusiveNewsBinding
    lateinit var viewModel: ExclusiveNewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExclusiveNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeComponents()
    }

    private fun initializeComponents() {
        // Instantiate the news repository
        val exclusiveNewsRepository = ExclusiveNewsRepositoryImpl(application)
        val viewModelProviderFactory = ExclusiveNewsViewModelProviderFactory(application, exclusiveNewsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[ExclusiveNewsViewModel::class.java]
    }
}