package com.example.todo


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.components.ProfileHeaderComponents
import com.example.todo.components.Task
import com.example.todo.components.TasksComponent
import com.example.todo.components.WelcomeMessage
import com.example.todo.components.taskList
import com.example.todo.ui.theme.ToDoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var selectedScreen by remember { mutableStateOf(1)}

            ToDoTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FinalApplication()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview
fun FinalApplication() {
    var screens = listOf("Calendar","Home","Notifications")
    var selectedScreen by remember { mutableStateOf(1)}
    Scaffold (
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .height(65.dp)
                    .background(Color.White),
                    ){
                screens.forEachIndexed{ index, _ ->
                    val icon: ImageVector = when(index) {
                        0-> Icons.Filled.CalendarMonth
                        1-> Icons.Filled.Home
                        2->Icons.Filled.Mail

                        else
                            ->Icons.Filled.Home
                    }
                NavigationBarItem(selected = selectedScreen == index,
                    onClick = {selectedScreen = index},
                     icon = {
                         Box(modifier = Modifier.size(55.dp)
                             .clip(CircleShape)
                             .background(if (selectedScreen == index) Color.Black
                             else Color.White),
                             contentAlignment = Alignment.Center
                         ){
                             Icon(imageVector = icon,
                                 contentDescription = "Screen",
                             modifier = Modifier.size(40.dp)
                                 .padding(12.dp),
                                 tint = if (selectedScreen == index) Color.White
                                 else Color.Black
                             )
                         }
                     })

                }

            }

        }
    ){
        Column(modifier = Modifier.padding(start = 16.dp, bottom = 5.dp, top = 10.dp)){
            ProfileHeaderComponents()
            Spacer(modifier = Modifier.height(30.dp))
            WelcomeMessage()
            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn(contentPadding = PaddingValues(start = 16.dp, bottom = 16.dp, top = 10.dp)){
                items(taskList) { task ->
                    TasksComponent(task = task)
                    Spacer(modifier = Modifier.height(10.dp))
                }

            }

        }
    }


}
