package com.example.semana2_1.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavHostController
import com.example.semana2_1.R
import com.example.semana2_1.components.TopBar

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
    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        topBar = {
            TopBar (onOpenDrawer = { }  )
        }
    ) {
      Principal(saveScreen)
    }
}

@Composable
fun Principal(saveScreen : NavHostController){
    var userEmail by remember { mutableStateOf("ADMIN") }
    var userPassword by remember { mutableStateOf("UPC123") }

    Column(
        Modifier
            .padding(40.dp)
            .padding(vertical = 20.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id= R.drawable.user),
            contentDescription = "Icon Reference",
            modifier = Modifier
                .width(230.dp)
                .height(230.dp)
                .padding(vertical = 40.dp)
        )

        Text(text = "LOGIN USER",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
            color = Color.Blue)

        // Email input
        OutlinedTextField(
         value = userEmail,
         modifier = Modifier
             .padding(10.dp)
             .padding(vertical = 5.dp),
            label = { Text(text = "Email")},
            placeholder = { Text(text = "User Email")},
            leadingIcon =
                {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "",
                        tint = Color.LightGray
                    )
                },
            trailingIcon = {
                if(userEmail.isNotEmpty()){
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Icon Reference",
                        tint = Color.LightGray
                    )
                }
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Blue,
                unfocusedTextColor = Color.LightGray,
                focusedContainerColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            onValueChange = {
                userEmail = it
            }
        )

        // Password input
        OutlinedTextField(
            value = userPassword,
            modifier = Modifier
                .padding(10.dp)
                .padding(vertical = 5.dp),
            label = { Text(text = "Password")},
            placeholder = { Text(text = "User Password")},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "",
                    tint = Color.LightGray
                )
            },
            trailingIcon = {
                if(userPassword.isNotEmpty()){
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Icon Reference",
                        tint = Color.LightGray
                    )
                }
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Blue,
                unfocusedTextColor = Color.LightGray,
                focusedContainerColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = {
                userPassword = it
            }
        )

        var isDisplay by remember { mutableStateOf(false) }

        if (isDisplay){
            Dialog(onDismissRequest = {isDisplay=false}) {
                Card(modifier = Modifier
                    .height(300.dp),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "‼️FATAL ERROR",
                            fontSize = 22.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red,
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.size(20.dp))

                        Text(text = "️❌THE USER OR PASSWORD IS INCORRECT",
                            fontSize = 22.5.sp,
                            fontWeight = FontWeight.Thin,
                            color = Color.Blue,
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.size(20.dp))

                        Button(
                            onClick = {
                                isDisplay = false
                            }
                        ) {
                            Text(text = "Try Again",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }

        ElevatedButton(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            //shape = Shapes().large,
            //enabled = userEmail.isNotEmpty() && userPassword.isNotEmpty(),
            colors = ButtonDefaults.buttonColors(
                Color.Blue
            ),
            onClick = {
                /*if (userEmail.isNotEmpty() && userPassword.isNotEmpty()){
                    saveScreen.navigate("V2")
                }*/
                if (userEmail == "ADMIN"  && userPassword == "UPC123"){
                    saveScreen.navigate("V2")
                } else {
                    isDisplay = true
                }
            }
        ) {
            Text(text = "Login",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}