package com.example.semana2_1.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(onOpenDrawer: () -> Unit) {
    // Implementation of the TopBar component

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            //containerColor = Color.hsl(225f, 63.5f, 53.1f)
            containerColor = Color.Blue
        ),
        title = {
            Text(text = "System Info",
                color = Color.White)
        },
        navigationIcon = {
            IconButton( onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Admin Menu",
                    tint = Color.White
                )
            }
        },

        actions = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Rounded.Settings,
                    contentDescription = "null",
                    tint = Color.White
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Rounded.Person,
                    contentDescription = "null",
                    tint = Color.White
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Rounded.ExitToApp,
                    contentDescription = "null",
                    tint = Color.White
                )
            }
        }
    )

}