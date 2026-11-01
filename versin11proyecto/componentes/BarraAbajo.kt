package com.example.versin11proyecto.componentes

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun BarraInferior(){
    var seleccionado by remember { mutableIntStateOf(0) }

    val opciones = listOf("Explorar", "Añadir" , "Buscar" , "Perfil")
    val iconos = listOf("🏠" , "➕" , "🔎" , "👤")

    NavigationBar {
        opciones.forEachIndexed { indice, nombre ->
            NavigationBarItem(
                selected = seleccionado == indice,
                onClick = { seleccionado = indice },
                icon = { Text(iconos[indice]) },
                label = { Text(nombre) }
            )
        }
    }
}