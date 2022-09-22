package com.kieuapps.jetpackcomposegithubexamples.button

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RoundedButtonExample() {
	Button(
		onClick = { /* TODO */ },
		shape = CircleShape
	) {
		Text("Button")
	}
}