package com.kieuapps.jetpackcomposegithubexamples.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SpacerExample() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.background(MaterialTheme.colors.surface)
	) {
		Spacer(
			Modifier
				.background(Color.LightGray)
				.height(1.dp)
				.fillMaxWidth()
		)
	}
}