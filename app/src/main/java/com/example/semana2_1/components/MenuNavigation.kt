package com.example.semana2_1.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun MenuNavigation( saveScreen: NavHostController ) {

    NavigationBar(){

        NavigationBarItem(
            selected = false,
            label = { Text(text="Mail") },
            onClick = {},
            icon = { Icon(Icons.Filled.Email,
                contentDescription = "null") }
        )

        NavigationBarItem(
            selected = false,
            label = { Text(text="Settings") },
            onClick = {},
            icon = { Icon(Icons.Filled.Settings,
                contentDescription = "null") }
        )

        NavigationBarItem(
            selected = false,
            label = { Text(text="Exit") },
            onClick = {saveScreen.popBackStack()},
            icon = { Icon(Icons.Filled.Close,
                contentDescription = "null") }
        )
    }

}