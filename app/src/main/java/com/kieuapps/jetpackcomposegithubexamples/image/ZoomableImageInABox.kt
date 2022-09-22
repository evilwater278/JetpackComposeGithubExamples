package com.kieuapps.jetpackcomposegithubexamples.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.R

@Composable
fun ZoomableBoxExample() {
	val androidImage = painterResource(R.drawable.ic_launcher_foreground)
	val scale = remember { mutableStateOf(1f) }
	
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(200.dp)
			.pointerInput(Unit) {
				detectTransformGestures { _, _, zoom, _ ->
					scale.value *= zoom
				}
			}
	) {
		Image(androidImage, "Android",
			modifier = Modifier
				.align(Alignment.Center)
				.graphicsLayer(
					scaleX = maxOf(0.5f, minOf(5f, scale.value)),
					scaleY = maxOf(0.5f, minOf(5f, scale.value))
				)
		)
	}
}