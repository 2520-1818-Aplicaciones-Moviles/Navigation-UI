package com.example.semana2_1.components

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.semana2_1.R

@Composable
fun Drawer(nav: NavHostController) {

    // Exclusive to Drawer (Image inside a Box)
    Box(
        modifier = Modifier
            .height(180.dp)
            .width(180.dp)
            .padding(25.dp)
    ) {
        Image(painter = painterResource(id= R.drawable.persona),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .size(130.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
    }

    Text(text = "UPC MOBILE", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp), fontSize = 25.sp)

    HorizontalDivider()

    // Menu Options
    // Spacer is used to give space between components
    // Commonly used in Column or Row
    Spacer(modifier = Modifier.height(10.dp))

    // NavigationDrawerItem is used inside a NavigationDrawer
    // It represents a single item in the drawer
    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
            )
        },
        label = {
            Text(
                text = "Profile",
                fontSize = 17.sp,
                modifier = Modifier.padding(15.dp)
            )
        },

        selected = false,

        onClick = { }
    )

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
            )
        },
        label = {
            Text(
                text = "Notifications",
                fontSize = 17.sp,
                modifier = Modifier.padding(15.dp)
            )
        },

        selected = false,

        onClick = { }
    )

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
            )
        },
        label = {
            Text(
                text = "Home",
                fontSize = 17.sp,
                modifier = Modifier.padding(15.dp)
            )
        },

        selected = false,

        onClick = { }
    )

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
            )
        },
        label = {
            Text(
                text = "Add New",
                fontSize = 17.sp,
                modifier = Modifier.padding(15.dp)
            )
        },

        selected = false,

        onClick = { }
    )

    Spacer(modifier = Modifier.padding(20.dp))
    HorizontalDivider()
    Spacer(modifier = Modifier.padding(20.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = null,
            )
        },
        label = {
            Text(
                text = "Exit",
                fontSize = 17.sp,
                modifier = Modifier.padding(15.dp)
            )
        },

        selected = true,

        onClick = { }
    )
}