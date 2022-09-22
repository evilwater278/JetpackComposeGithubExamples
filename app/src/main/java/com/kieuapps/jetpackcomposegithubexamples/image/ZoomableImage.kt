package com.kieuapps.jetpackcomposegithubexamples.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.R

@Composable
fun ZoomableImageExample() {
	val androidImage = painterResource(R.drawable.ic_launcher_foreground)
	val scale = remember { mutableStateOf(1f) }
	
	Image(
		painter = androidImage, 
		contentDescription = "Android",
		modifier = Modifier
			.fillMaxWidth()
			.height(200.dp)
			.pointerInput(Unit) {
				detectTransformGestures { _, _, zoom, _ ->
					scale.value *= zoom
				}
			}
			.graphicsLayer(
				scaleX = maxOf(0.5f, minOf(5f, scale.value)),
				scaleY = maxOf(0.5f, minOf(5f, scale.value))
			)
	)
}