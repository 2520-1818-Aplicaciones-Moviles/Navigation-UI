package com.example.semana2_1.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun View1(saveScreen : NavHostController){
    /*Column(
        Modifier
            .padding(vertical = 50.dp)
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "First View ",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp)

        Button(onClick = {
            saveScreen.navigate("V2")
        }) {
            Text(text = "Go to the second view")
        }

        Button(onClick = {
            saveScreen.navigate("V3")
        }) {
            Text(text = "Go to the third view")
        }
    }
    */


    // Widget to alocate different areas on the screen
    // It is like a frame or a container for other components
    Scaffold() {
      Principal(saveScreen)
    }
}

@Composable
fun Principal(saveScreen : NavHostController){
    var userEmail by remember { mutableStateOf("") }
    var userPassword by remember { mutableStateOf("") }
}