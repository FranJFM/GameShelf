package com.example.versin11proyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.versin11proyecto.componentes.BarraInferior
import com.example.versin11proyecto.modelo.Juego
import com.example.versin11proyecto.pantalla1.explorarPantalla
import com.example.versin11proyecto.pantalla2.detallePantalla
import com.example.versin11proyecto.ui.theme.Versión11ProyectoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Versión11ProyectoTheme {
                GameLibraryApp()
            }
        }
    }
}

@Composable
fun GameLibraryApp() {
    val dlcs = listOf("saviavida")

    val juegos = listOf(
        Juego("Hollow Knight", "19/02/2017", "Terminado", 4, "20€", dlcs),
        Juego("The Last Of Us", "19/06/2013", "Terminado", 3, "59€", dlcs),
        Juego("Unreturning", "11/03/2027", "Pendiente", 4, "10€", dlcs)
    )

    var juegoSeleccionado by remember { mutableStateOf<Juego?>(null) }
    val juego = juegoSeleccionado


    if (juego == null) {
        explorarPantalla(
            juegos = juegos,
            onJuegoClick = { juegoSeleccionado = it }
        )
    } else {
        detallePantalla(
            juego = juego,
            onVolver = { juegoSeleccionado = null }
        )
    }
}



@Preview(showBackground = true)
@Composable
fun Preview() {
    Versión11ProyectoTheme {
        GameLibraryApp()
    }
}