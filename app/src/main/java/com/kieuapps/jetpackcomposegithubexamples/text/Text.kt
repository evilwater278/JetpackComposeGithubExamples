package com.kieuapps.jetpackcomposegithubexamples.text

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextExample() {
	val name = "Kotlin"
	
	Text(
		text = "Hello, $name!",
		modifier = Modifier.padding(8.dp)
	)
}