package com.github.goutarouh.ingapp.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.github.goutarouh.ingapp.MainViewModel
import com.github.goutarouh.ingapp.R

@Composable
fun StartScreen(viewModel: MainViewModel) {
  StartContent {
    viewModel.start()
  }
}

@Composable
fun StartContent(
  onStartClicked: () -> Unit
) {
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ) {
    Button(
      onClick = onStartClicked
    ) {
      Text(
        text = stringResource(id = R.string.start_button),
        fontSize = 30.sp
      )
    }
  }
}



@Preview(
  showBackground = true
)
@Composable
fun TestStartScreen() {
  StartContent() {}
}
