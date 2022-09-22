package com.kieuapps.jetpackcomposegithubexamples.appbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BottomAppBarExample() {
	BottomAppBar(
		contentPadding = PaddingValues(4.dp)
	) {
		Spacer(Modifier.weight(1f))
		IconButton(
			onClick = { /* TODO */ }
		) {
			Icon(
				Icons.Default.Person,
				contentDescription = "Contacts"
			)
		}
		IconButton(
			onClick = { /* TODO */ }
		) {
			Icon(
				Icons.Default.Home,
				contentDescription = "Home"
			)
		}
		IconButton(
			onClick = { /* TODO */ }
		) {
			Icon(
				Icons.Default.Notifications,
				contentDescription = "Notifications"
			)
		}
		Spacer(Modifier.weight(1f))
	}
}