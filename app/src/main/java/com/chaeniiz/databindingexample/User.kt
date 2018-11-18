package com.chaeniiz.databindingexample

import android.databinding.ObservableField

data class User(
    val name: String,
    val nickname: String,
    val selfIntroduction: ObservableField<String>
)
