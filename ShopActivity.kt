package com.example.pruebass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebass.ui.theme.PruebassTheme

data class Product(val name: String, val price: String, val imageRes: Int)

class StoreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebassTheme {
                StoreScreen()
            }
        }
    }
}

@Composable
fun StoreScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFADD8E6)), // Color de fondo
    ) {
        TopBar()
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(sampleProducts) { product ->
                ProductCard(product)
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Tienda", fontSize = 24.sp, color = Color.Black)
        IconButton(onClick = { /* Acción para abrir el carrito */ }) {
            Icon(painter = painterResource(id = R.drawable.carrito), contentDescription = "Carrito")
        }
    }
}

@Composable
fun ProductCard(product: Product) {
    Column(
        modifier = Modifier
            .background(Color.White.copy(alpha = 0.7f))
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = product.imageRes), contentDescription = product.name)
        Text(text = product.name, fontSize = 16.sp, color = Color.Black)
        Text(text = product.price, fontSize = 14.sp, color = Color.Black)
    }
}

// Lista de productos de ejemplo
val sampleProducts = listOf(
    Product("Producto 1", "$10", R.drawable.tenis),
    Product("Producto 2", "$20", R.drawable.tenis),
    Product("Producto 3", "$30", R.drawable.tenis)
)
