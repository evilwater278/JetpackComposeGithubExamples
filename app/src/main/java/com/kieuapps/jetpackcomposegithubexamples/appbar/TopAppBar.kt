package com.kieuapps.jetpackcomposegithubexamples.appbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBarExample() {
	TopAppBar(
		contentPadding = PaddingValues(4.dp)
	) {
		IconButton(
			onClick = { /* TODO */ }
		) {
			Icon(
				Icons.Default.Menu,
				contentDescription = "Menu"
			)
		}
		Spacer(Modifier.weight(1f))
		IconButton(
			onClick = { /* TODO */ }
		) {
			Icon(
				Icons.Default.Settings,
				contentDescription = "Settings"
			)
		}
	}
}