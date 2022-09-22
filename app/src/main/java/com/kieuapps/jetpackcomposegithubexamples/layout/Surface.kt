package com.kieuapps.jetpackcomposegithubexamples.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.ui.theme.Shapes

@Composable
fun SurfaceExample() {
	Surface(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp),
		shape = Shapes.large,
		color = MaterialTheme.colors.background,
		contentColor = Color.White,
		border = BorderStroke(
			width = 2.dp,
			color = Color.White
		),
		elevation = 8.dp
	) {
		
	}
}