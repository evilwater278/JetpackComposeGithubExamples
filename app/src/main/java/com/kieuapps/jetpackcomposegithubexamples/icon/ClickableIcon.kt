package com.kieuapps.jetpackcomposegithubexamples.icon

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ClickableIconExample() {
	Icon(
		imageVector = Icons.Default.ShoppingCart,
		contentDescription = "Cart", 
		modifier = Modifier
			.clickable {
				/* Your code... */
			}
			.padding(8.dp)
	)
}