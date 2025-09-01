package com.example.semana2_1.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.semana2_1.R

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

    Column(
        Modifier
            .padding(40.dp)
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
                .padding(vertical = 20.dp)
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
                if (userEmail.isNotEmpty() && userPassword.isNotEmpty()){
                    saveScreen.navigate("V2")
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