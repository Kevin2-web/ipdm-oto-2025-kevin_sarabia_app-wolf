package com.example.appwolf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appwolf.ui.theme.AppWolfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppWolfTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingCard("Kevin Sarabia")
                }
            }
        }
    }
}

@Composable
fun GreetingCard(name: String) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .animateContentSize(),
        onClick = { expanded = !expanded }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Hola, $name!", style = MaterialTheme.typography.headlineSmall)
            if (expanded) {
                Text("Bienvenido a la app Woof modificada con Jetpack Compose y animaciones.",
                     style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}
