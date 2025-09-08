package com.example.semana2_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.semana2_1.nav.Navigation
import com.example.semana2_1.ui.theme.Semana2_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Semana2_1Theme {
                Navigation()
            }
        }
    }
}

