package com.kieuapps.jetpackcomposegithubexamples.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoxExample() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp),
		contentAlignment = Alignment.TopStart
	) {
		/* Your Compose code... */
		
	}
}