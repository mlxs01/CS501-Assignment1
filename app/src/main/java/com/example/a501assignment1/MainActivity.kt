package com.example.a501assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a501assignment1.ui.theme._501Assignment1Theme
//imports added to make button work
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _501Assignment1Theme {
                //var clicked = false
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var clicked by remember { mutableStateOf(false) }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .padding(16.dp) // I heard dp is the best use of
                                            // pixel measurement in Android Studio
                    ) {
                        Button(onClick = {
                            clicked = true //one time change on clicked variable
                        }) {
                            Text("Click me")
                        }
                        if (clicked) {Greeting(name = "World")}
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _501Assignment1Theme {
        Greeting("Android, also if here, u did not compile and run on emulator or physical android.")
    }
}