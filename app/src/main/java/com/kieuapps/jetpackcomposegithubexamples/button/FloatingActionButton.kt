package com.kieuapps.jetpackcomposegithubexamples.button

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable

@Composable
fun FloatingActionButtonExample() {
	FloatingActionButton(
		onClick = { /* TODO */ }
	) {
		Icon(
			Icons.Default.Email,
			contentDescription = "Email"
		)
	}
}