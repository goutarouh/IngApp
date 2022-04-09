package com.github.goutarouh.ingapp.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.goutarouh.ingapp.MainViewModel
import com.github.goutarouh.ingapp.model.ExampleSentence
import com.github.goutarouh.ingapp.ui.theme.AppFont
import com.github.goutarouh.ingapp.ui.theme.Space


@Composable
fun StudyScreen(
  viewModel: MainViewModel
) {
  val sentence = viewModel.sentence.collectAsState(initial = ExampleSentence())
  Sentence(exampleSentence = sentence.value)
}

@Composable
fun Sentence(exampleSentence: ExampleSentence) {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = exampleSentence.japanese,
      fontSize = AppFont.Medium
    )
    Spacer(modifier = Modifier.height(Space.Large))
    Text(
      text = exampleSentence.english,
      fontSize = AppFont.Large
    )
  }
}


@Preview(
  showBackground = true,
  widthDp = 600,
  heightDp = 300
)
@Composable
fun TestSentence() {
  Sentence(
    exampleSentence = ExampleSentence(
      english = "hello",
      japanese = "こんにちは"
    )
  )
}