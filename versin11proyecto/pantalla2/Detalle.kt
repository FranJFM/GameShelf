package com.example.versin11proyecto.pantalla2

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.versin11proyecto.modelo.Juego
import com.example.versin11proyecto.pantalla1.explorarPantalla
import com.example.versin11proyecto.ui.theme.Versión11ProyectoTheme

@Composable
fun detallePantalla(juego: Juego,onVolver:() -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onVolver) {
                Text("←", fontSize = 24.sp)
            }
        }
        Text(
            "Detalles Juegos",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.size(90.dp)
                    .background(Color.LightGray)
            )
            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Column() {
                Text(
                    text = "★".repeat(juego.valoraciones) + "☆".repeat(5 - juego.valoraciones),
                    color = Color(0xFFFFC107),
                    fontSize = 20.sp
                )
                Text(
                    "Lanzamiento: ${juego.fechaLanzamiento}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        Text(
            "DLCs",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
        )
        juego.dlcs.forEach { dlc ->
            Text("• $dlc")
        }

        Text(
            "Precio",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
        )
        Text(juego.precio)


        Text(
            "Estado",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
        )
        Text(juego.estado)

        Text(
            "Tráiler",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
        )
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(180.dp)
                .background(Color.LightGray)
        )

        Text(
            "Fotos",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp, bottom = 8.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(Color.LightGray)
            )
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(Color.LightGray)
            )
        }
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(Color.LightGray)
            )
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(Color.LightGray)
            )
        }
        Spacer(
            modifier = Modifier.height(16.dp)
        )
    }
}
