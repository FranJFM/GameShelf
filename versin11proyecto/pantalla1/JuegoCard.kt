package com.example.versin11proyecto.pantalla1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.versin11proyecto.modelo.Juego

@Composable
fun tarjetaJuego(juego: Juego){
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.size(64.dp).background(Color.LightGray)
            )
            Spacer(
                modifier = Modifier.weight(1f)
            )
            Column(
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text = juego.titulo,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Lanzamiento: ${juego.fechaLanzamiento}",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    "estado: ${juego.estado}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Text(
                "★",
                color = Color.Yellow,
                fontSize = 24.sp
            )
        }
    }
}