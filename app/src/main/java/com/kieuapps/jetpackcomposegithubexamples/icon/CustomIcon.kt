package com.kieuapps.jetpackcomposegithubexamples.icon

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.R

@Composable
fun CustomIconExample() {
	Icon(
		painterResource(R.drawable.ic_baseline_local_florist_24),
		contentDescription = "Flower",
		modifier = Modifier.padding(8.dp)
	)
}