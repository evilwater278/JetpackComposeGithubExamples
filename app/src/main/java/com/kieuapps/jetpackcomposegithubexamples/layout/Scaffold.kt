package com.kieuapps.jetpackcomposegithubexamples.layout

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun ScaffoldExample() {
	val scope = rememberCoroutineScope()
	val scaffoldState = rememberScaffoldState()
	val drawer = scaffoldState.drawerState
	val context = androidx.compose.ui.platform.LocalContext.current
	val list = mutableListOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
	
	Box(
		modifier = Modifier
			.fillMaxSize()
			.background(MaterialTheme.colors.surface)
	) {
		Scaffold(
			modifier = Modifier
				.width(200.dp)
				.height(350.dp),
			scaffoldState = scaffoldState,
			topBar = {
				TopAppBar {
					IconButton(
						onClick = {
							scope.launch { drawer.open() }
							/* TODO */
						}
					) {
						Icon(
							Icons.Default.Menu,
							contentDescription = "Menu"
						)
					}
					Spacer(Modifier.weight(1f))
					IconButton(onClick = { /* TODO */ }) {
						Icon(
							Icons.Default.Settings,
							contentDescription = "Settings"
						)
					}
				}
			},
			bottomBar = {
				BottomAppBar(contentPadding = PaddingValues(horizontal = 4.dp)) {
					Row(
						modifier = Modifier.fillMaxWidth(), 
						horizontalArrangement = Arrangement.SpaceEvenly
					) {
						IconButton(onClick = { /* TODO */ }) {
							Icon(
								Icons.Default.Person, 
								contentDescription = "Person"
							)
						}
						IconButton(onClick = { /* TODO */ }) {
							Icon(
								Icons.Default.Home, 
								contentDescription = "Home"
							)
						}
						IconButton(onClick = { /* TODO */ }) {
							Icon(
								Icons.Default.Notifications, 
								contentDescription = "Notifications"
							)
						}
					}
				}
			},
			floatingActionButton = {
				FloatingActionButton(
					onClick = { 
						Toast.makeText(context, "Clicked FAB Button", Toast.LENGTH_SHORT).show() 
						/* TODO */
					}
				) { 
					Icon(
						Icons.Default.Email, 
						contentDescription = "Email"
					) 
				}
			},
			drawerContent = {
				Column { 
					list.forEach { 
						Text(
							text = it, 
							modifier = Modifier
								.fillMaxWidth()
								.clickable { /* TODO */ }
								.padding(4.dp)) 
					} 
				}
			}
		) { padding ->
			
			Box(Modifier.padding(padding)) {
				/* Your main content... */
				
			}
			
			// To make Back press close the drawer
			if(drawer.isOpen) {
				BackHandler {
					scope.launch { drawer.close() }
				}
			}
		}
	}
}