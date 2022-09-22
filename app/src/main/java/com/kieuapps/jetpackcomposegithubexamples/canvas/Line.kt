package com.kieuapps.jetpackcomposegithubexamples.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LineExample() {
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasWidth = size.width
		val canvasHeight = size.height
		
		drawLine(
			color = Color.Red,
			strokeWidth = 2.dp.toPx(),
			start = Offset(0f, 0f),
			end = Offset(
				x = canvasWidth / 2,
				y = canvasHeight / 2
			)
		)
	}
}