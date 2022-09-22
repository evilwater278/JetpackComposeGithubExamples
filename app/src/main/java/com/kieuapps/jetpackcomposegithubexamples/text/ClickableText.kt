package com.kieuapps.jetpackcomposegithubexamples.text

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ClickableTextExample() {
	Text(
		text = "Click me",
		Modifier
			.clickable { /* TODO */}
			.padding(16.dp)
	)
}