package com.github.goutarouh.ingapp.model

data class BaseSentence(
  val id: Int = 0,
  val englishBase: String = "",
  val japaneseBase: String = "",
)

data class ExampleSentence(
  val id: Int = 0,
  val parentId: Int = 0,
  val english: String = "",
  val japanese: String = ""
)
