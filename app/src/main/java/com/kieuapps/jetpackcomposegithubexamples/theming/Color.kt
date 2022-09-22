package com.kieuapps.jetpackcomposegithubexamples.theming

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColorExample() {
	val onPrimaryColor = MaterialTheme.colors.onPrimary
	val blue = Color.Blue
	val purple = Color(0xFF9871BD)
	val white = Color(255, 255, 255)
	val green = Color(0.102f, 1.0f, 0.0f, 1.0f)
	
	Text(
		text = "Hello, Compose!",
		color = onPrimaryColor,
		modifier = Modifier
			.background(color = purple)
			.border(2.dp, green)
			.padding(2.dp)
			.border(2.dp, blue)
	)
}