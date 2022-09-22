package com.kieuapps.jetpackcomposegithubexamples.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.dp

@Composable
fun VerticalGradientExample() {
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		drawRect(
			brush = Brush.verticalGradient(
				colors = listOf(
					Color.White,
					Color.Magenta
				),
				startY = 0.dp.toPx(),
				endY = 50.dp.toPx(),
				tileMode = TileMode.Clamp
			)
		)
	}
}