package com.example.todo.components

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.R
import com.example.todo.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileHeaderComponents() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
        )
    {
        Image(painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)

            )
        BadgedBox(
            badge = {
                Badge (
                    containerColor = Orange,
                    contentColor = Color.White,
                    modifier = Modifier.offset(y = 7.dp, x = (-8).dp)
                )
            }, modifier = Modifier.padding(end = 16.dp)
            ) {
            Icon(imageVector = Icons.Filled.Notifications,
                contentDescription = "Notifications")
        }

    }
}

@Preview()
@Composable
fun App() {
    ProfileHeaderComponents()

}