package com.kieuapps.jetpackcomposegithubexamples.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CircleExample() {
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		drawCircle(
			color = Color.Green,
			radius = 25.dp.toPx()
		)
	}
}