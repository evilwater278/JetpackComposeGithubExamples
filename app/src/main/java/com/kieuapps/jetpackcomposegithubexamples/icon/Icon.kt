package com.kieuapps.jetpackcomposegithubexamples.icon

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.R

@Composable
fun IconExample() {
	Icon(
		Icons.Default.Email,
		contentDescription = "Email",
		modifier = Modifier.padding(8.dp)
	)
}