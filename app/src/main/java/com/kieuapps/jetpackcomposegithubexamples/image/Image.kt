package com.kieuapps.jetpackcomposegithubexamples.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.R

@Composable
fun ImageExample() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.height(100.dp)
	) {
		Image(
			painterResource(R.drawable.ic_launcher_foreground),
			contentDescription = "Android"
		)
	}
}