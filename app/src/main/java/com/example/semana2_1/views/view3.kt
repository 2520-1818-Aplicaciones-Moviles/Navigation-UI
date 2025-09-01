package com.example.semana2_1.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun View3(saveScreen : NavHostController) {
    Column(
        Modifier
            .padding(vertical = 50.dp)
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Third View 3",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )

        Button(onClick = {
            saveScreen.navigate("V1")
        }) {
            Text(text = "Go to Main view")
        }
    }
}