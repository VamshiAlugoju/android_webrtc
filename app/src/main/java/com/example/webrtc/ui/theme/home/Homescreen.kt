package com.example.webrtc.ui.theme.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome! 👋",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "This is your home screen.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(32.dp))
        // ✅ Correct
        Button(
            onClick = { navController.navigate("start_call") },
            modifier = Modifier.fillMaxWidth(),

        ) {
            Text("Start Call"  )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { navController.navigate("join_call") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Join Call")
        }
    }
}