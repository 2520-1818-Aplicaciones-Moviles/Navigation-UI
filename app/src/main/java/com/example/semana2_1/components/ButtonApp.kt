package com.example.semana2_1.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable

@Composable
fun ButtonApp() {
    // Implementation of ButtonApp

    BottomAppBar(
        actions = {

            IconButton(onClick = { }) {
                Icon(
                    Icons.Default.Done,
                    contentDescription = null
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = null
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    Icons.Default.DateRange,
                    contentDescription = null
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
            ) {
                Icon(Icons.Filled.AddCircle, contentDescription = null)
            }
        }
    )
}