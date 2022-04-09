package com.github.goutarouh.ingapp.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import com.github.goutarouh.ingapp.MainViewModel

import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.collect

@Composable
fun MainScreen(
  viewModel: MainViewModel = viewModel()
) {

  val isStudying = viewModel.isStudying.collectAsState().value

  if (isStudying) {
    StudyScreen(viewModel = viewModel)
  } else {
    StartScreen(viewModel = viewModel)
  }
}
