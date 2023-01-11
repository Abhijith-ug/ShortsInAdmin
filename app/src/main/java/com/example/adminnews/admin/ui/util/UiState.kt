package com.example.adminnews.admin.ui.util


/* Sealed class is kind of an abstract class but we can decide
 which classes are allowed to inherit from a sealed class. */
sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<out T>(val data: T) : UiState<T>()
    data class Failure(val error: String?) : UiState<Nothing>()
}