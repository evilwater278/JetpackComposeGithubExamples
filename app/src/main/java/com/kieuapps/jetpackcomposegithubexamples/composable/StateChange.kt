package com.kieuapps.jetpackcomposegithubexamples.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun StateChangeExample() {
	Row(Modifier.fillMaxWidth()) {
		
		// The remember keyword will NOT
		// persist with screen rotation.
		// For that, you'll want to use
		// rememberSaveable instead.
		val isChecked = remember { mutableStateOf(false) }
		
		Checkbox(
			checked = isChecked.value,
			onCheckedChange = { isChecked.value = it }
		)
		
		// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		var alsoIsChecked by remember { mutableStateOf(false) }
		
		Checkbox(
			checked = alsoIsChecked,
			onCheckedChange = { alsoIsChecked = it }
		)
	}
}