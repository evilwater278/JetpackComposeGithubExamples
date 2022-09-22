package com.kieuapps.jetpackcomposegithubexamples.widget

import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun LinearProgressIndicatorExample() {
	var progress by remember { mutableStateOf(0f) }
	
	LaunchedEffect(Unit) {
		while(progress < 1f) {
			delay(75L)
			progress += 0.01f
		}
	}
	
	LinearProgressIndicator(
		progress = progress,
		modifier = Modifier.padding(24.dp)
	)
}