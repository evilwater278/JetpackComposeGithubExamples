package com.kieuapps.jetpackcomposegithubexamples.canvas

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.unit.dp

@Composable
fun CanvasInABoxExample() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
			.drawBehind {
				val canvasWidth = size.width
				val canvasHeight = size.height
				
				/* Your Canvas code... */
				
			}
	) {
		/* Your Compose code... */
		
	}
}