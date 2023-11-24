package com.example.todo.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo.ui.theme.Orange
import com.example.todo.ui.theme.Purple40

@Composable
fun WelcomeMessage() {
    val colorr : Color  = Orange
    val cc: Color = Purple40
    Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "Hi Adriano ",
            fontFamily = FontFamily.Cursive,
            color = cc,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
            )

        Text(text = "Hey, you have ${taskList.size} tasks today",
            fontFamily = FontFamily.Monospace,
            color = colorr,
            fontSize = 22.sp
            )
    }
}