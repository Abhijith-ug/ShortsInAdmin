package com.example.adminnews.admin.ui.ui.fragments.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.adminnews.admin.ui.Repository.ExclusiveNewsRepositoryImpl

class ExclusiveNewsViewModelProviderFactory(
    val app: Application,
    private val exclusiveNewsRepository: ExclusiveNewsRepositoryImpl
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ExclusiveNewsViewModel(app, exclusiveNewsRepository) as T
    }
}