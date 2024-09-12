package com.example.pruebass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.geometry.Offset
import com.example.pruebass.ui.theme.PruebassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebassTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFADD8E6)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween // Cambiado a SpaceBetween para distribuir los elementos
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 100.dp)
        ) {
            Text(
                text = "Ecoshopfriend",
                fontSize = 32.sp, // Tamaño de fuente más grande
                color = Color.Black, // Color negro
                fontWeight = FontWeight.Bold, // Negrita
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Gray,
                        offset = Offset(2f, 2f),
                        blurRadius = 4f
                    )
                ),
                textAlign = TextAlign.Center // Centrar el texto
            )
            Spacer(modifier = Modifier.width(8.dp)) // Espaciador para separar el texto de la imagen
            Image(
                painter = painterResource(id = R.drawable.hojita),
                contentDescription = null,
                modifier = Modifier.size(40.dp) // Ajusta el tamaño de la imagen según sea necesario
            )
        }
        Spacer(modifier = Modifier.weight(1f)) // Espaciador para empujar la imagen hacia el centro
        Image(
            painter = painterResource(id = R.drawable.appimagen1),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(vertical = 20.dp) // Ajusta este valor para cambiar la separación
        )
        Spacer(modifier = Modifier.weight(1f)) // Espaciador para empujar el botón hacia abajo
        Button(
            onClick = { /* Acción del botón */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF90EE90)), // Verde clarito
            modifier = Modifier.padding(bottom = 50.dp)
        ) {
            Text(
                text = "Comenzar",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    PruebassTheme {
        MainScreen()
    }
}
