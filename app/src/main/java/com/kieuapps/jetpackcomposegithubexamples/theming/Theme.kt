package com.kieuapps.jetpackcomposegithubexamples.theming

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThemeExample() {
	val isLightTheme = MaterialTheme.colors.isLight
	
	Box(
		modifier = Modifier
			.padding(4.dp)
			.background(MaterialTheme.colors.surface)
			.border(2.dp, MaterialTheme.colors.secondaryVariant)
			.padding(4.dp)
	) {
		if(isLightTheme) {
			Text(
				text = "You're in Light mode",
				color = MaterialTheme.colors.onSurface
			)
		} else {
			Text(
				text = "You're in Dark mode",
				color = MaterialTheme.colors.onSurface
			)
		}
	}
}