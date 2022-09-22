package com.kieuapps.jetpackcomposegithubexamples.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ArcExample() {
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		drawArc(
			color = Color.Yellow,
			startAngle = 30f,
			sweepAngle = 300f,
			useCenter = true,
			topLeft = Offset(25.dp.toPx(), 50.dp.toPx()),
			size = Size(50.dp.toPx(), 50.dp.toPx())
		)
	}
}