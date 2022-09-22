package com.kieuapps.jetpackcomposegithubexamples.text

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kieuapps.jetpackcomposegithubexamples.R

@Composable
fun TextFromStringResourceExample() {	
	Text(
		text = stringResource(R.string.your_string), 
		modifier = Modifier.padding(8.dp)
	)
}