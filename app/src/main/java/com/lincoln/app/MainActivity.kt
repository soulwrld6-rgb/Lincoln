package com.lincoln.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LincolnHud()
        }
    }
}

@Composable
fun LincolnHud() {
    val hudCyan = Color(0xFF33E6FF)

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(220.dp)
                        .border(2.dp, hudCyan, CircleShape)
                        .background(Color(0xFF0A0F14), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "LINCOLN",
                        color = hudCyan,
                        fontSize = 20.sp
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "Systems standby. Say \"Lincoln\" to begin.",
                    color = hudCyan.copy(alpha = 0.7f),
                    fontSize = 14.sp
                )
            }
        }
    }
}
