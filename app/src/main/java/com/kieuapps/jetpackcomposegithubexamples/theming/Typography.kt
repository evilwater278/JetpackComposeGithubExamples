package com.kieuapps.jetpackcomposegithubexamples.theming

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TypographyExample() {
	Column(
		modifier = Modifier.fillMaxWidth()
	) {
		Text(
			text = "Header 3 text",
			style = MaterialTheme.typography.h3,
			fontFamily = FontFamily.Cursive,
			fontWeight = FontWeight.Bold,
			fontSize = 48.sp
		)
		Text(
			text = "Header 6 text",
			style = MaterialTheme.typography.h6
		)
		Text(
			text = "Body 1 text",
			style = MaterialTheme.typography.body1
		)
		Text(
			text = "Button text",
			style = MaterialTheme.typography.button
		)
		Text(
			text = "Subtitle 1 text",
			style = MaterialTheme.typography.subtitle1,
			fontFamily = FontFamily.Serif,
			fontWeight = FontWeight.Normal,
			fontSize = 16.sp
		)
		Text(
			text = "Caption text",
			style = MaterialTheme.typography.caption
		)
	}
}