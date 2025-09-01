package com.example.semana2_1.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.semana2_1.views.View1
import com.example.semana2_1.views.View2
import com.example.semana2_1.views.View3

@Composable
fun Navigation(){
    val saveScreen = rememberNavController()
    NavHost(navController = saveScreen,
        startDestination = "V1"){
        composable("V1"){ View1(saveScreen) }
        composable("V2"){ View2(saveScreen) }
        composable("V3"){ View3(saveScreen) }
    }
}