package br.com.moronari.helloandroid.extension

import android.widget.EditText

fun EditText.value() = this.text.toString()