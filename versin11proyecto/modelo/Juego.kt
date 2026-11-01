package com.example.versin11proyecto.modelo
import androidx.annotation.DrawableRes
data class Juego(
    val titulo: String,
    val fechaLanzamiento : String,
    val estado: String,
    val valoraciones : Int,
    val precio : String,
    val dlcs: List<String> = emptyList()
)