package com.example.semana2_1.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import com.example.semana2_1.components.Drawer
import com.example.semana2_1.components.MenuNavigation
import com.example.semana2_1.components.TopBar
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun View2(saveScreen : NavHostController){

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    var scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            /*Drawer(nav = saveScreen)*/
            ModalDrawerSheet {
                Drawer(saveScreen)
            }
        }
    ) {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBar(
                onOpenDrawer = {
                    scope.launch {
                        drawerState.apply {
                            if (isClosed){
                                open()
                            } else {
                                close()
                            }
                        }
                    }
                }
            )
        },
        bottomBar = {
            MenuNavigation(saveScreen)
        }) {
            Principal2()
        }
    }

    /*Column(
        Modifier
            .padding(vertical = 50.dp)
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Second View 2",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp)
    }

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

            IconButton(onClick = {
                saveScreen.navigate("V1")
            }) {
                Icon(
                    imageVector = Icons.Rounded.ExitToApp,
                    contentDescription = "null",
                    tint = Color.White
                )
            }
        }
    )*/

}

@Composable
fun Principal2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 125.dp)
            .padding(horizontal = 35.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Control Panel",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Blue
        )
    }
}