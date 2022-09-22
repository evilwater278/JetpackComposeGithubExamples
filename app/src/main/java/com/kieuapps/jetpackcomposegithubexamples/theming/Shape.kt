package com.kieuapps.jetpackcomposegithubexamples.theming

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShapeExample() {
	Row(Modifier.fillMaxWidth()) {
		Text(
			text = "Small example",
			modifier = Modifier
				.padding(8.dp)
				.clip(MaterialTheme.shapes.small)
				.background(Color(0xFF698F52))
				.padding(16.dp)
		)
		Text(
			text = "Large example",
			modifier = Modifier
				.padding(8.dp)
				.clip(MaterialTheme.shapes.large)
				.background(Color(0xFF698F52))
				.padding(16.dp)
		)
	}
}