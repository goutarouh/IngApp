package com.github.goutarouh.ingapp

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.goutarouh.ingapp.model.ExampleSentence
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {

  private val _isStudying = MutableStateFlow(false)
  val isStudying: StateFlow<Boolean> = _isStudying

  val sentence: Flow<ExampleSentence> = flow {
    var index = 0
    while (true) {
      if (index > dummy.lastIndex) {
        index = 0
      }
      emit(dummy[index])
      delay(5000)
      index++
    }
  }

  private val dummy = listOf<ExampleSentence>(
    ExampleSentence(english = "hello", japanese = "こんにちは"),
    ExampleSentence(english = "good morning", japanese = "おはよう")
  )


  fun start() {
    _isStudying.value = true
  }

  fun finish() {
    _isStudying.value = false
  }

}