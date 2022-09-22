package com.kieuapps.jetpackcomposegithubexamples.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RadialGradientExample() {
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasWidth = size.width
		val canvasHeight = size.height
		
		drawCircle(
			brush = Brush.radialGradient(
				colors = listOf(
					Color.White,
					Color.Red,
					Color.Black
				),
				center = Offset(
					x = canvasWidth / 2.25f,
					y = canvasHeight / 5f
				),
				radius = canvasHeight
			)
		)
	}
}