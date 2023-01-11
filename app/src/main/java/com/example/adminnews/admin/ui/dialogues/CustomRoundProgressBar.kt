package com.example.adminnews.admin.ui.dialogues

import android.R
import android.app.Dialog
import android.content.Context
import android.view.Gravity
import com.example.adminnews.databinding.CustomRoundProgressBarBinding

class CustomRoundProgressBar(context: Context) : Dialog(context) {
    init {
        val params = window!!.attributes
        params.gravity = Gravity.CENTER_HORIZONTAL
        window!!.attributes = params
        setTitle(null)
        val binding = CustomRoundProgressBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setCancelable(false)
        window!!.setBackgroundDrawableResource(
            R.color.transparent
        )
    }
}