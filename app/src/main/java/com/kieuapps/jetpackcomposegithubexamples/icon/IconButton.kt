package com.kieuapps.jetpackcomposegithubexamples.icon

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonExample() {
	IconButton(
		onClick = { /* TODO */ },
		modifier = Modifier.padding(8.dp)
	) {
		Icon(
			Icons.Default.Favorite, 
			contentDescription = "Favorite"
		)
	}
}