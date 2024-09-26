package com.example.pruebass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.ButtonDefaults

import com.example.pruebass.ui.theme.PruebassTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebassTheme {
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen() {
    // Variables para los campos de texto
    var username = remember { "" }
    var password = remember { "" }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFADD8E6)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Texto de "Iniciar Sesión" en la parte superior
        Text(
            text = "Iniciar Sesión",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(top = 100.dp) // Espaciador superior
        )

        // Espaciador entre el texto y los campos
        Spacer(modifier = Modifier.height(20.dp))

        // Campo de texto para usuario
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Usuario") },
            modifier = Modifier.fillMaxWidth(0.8f) // Ajusta el ancho
        )

        // Espaciador entre los campos
        Spacer(modifier = Modifier.height(16.dp))

        // Campo de texto para contraseña
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth(0.8f) // Ajusta el ancho
        )

        Spacer(modifier = Modifier.weight(1f)) // Espaciador para empujar el botón hacia abajo

        // Botón "Entrar" en la parte inferior
        Button(
            onClick = { /* Acción para iniciar sesión */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF90EE90)),
            modifier = Modifier.padding(bottom = 50.dp)
        ) {
            Text(
                text = "Entrar",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
        }
    }
}
