package com.kieuapps.jetpackcomposegithubexamples.layout

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CanvasExample() {
	Canvas(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		val canvasWidth = size.width
		val canvasHeight = size.height
		
		/* Your Compose code... */
		
	}
}