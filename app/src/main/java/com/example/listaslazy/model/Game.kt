package com.example.listaslazy.model

import java.time.Year

data class Game (
    val id: Long = 0,
    val title: String = "",
    val studio: String = "",
    val releaseYear: Int = 0
) {
}