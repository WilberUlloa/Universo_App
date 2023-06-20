package com.example.eluniverso

data class Preguntas(
    val id: Int,
    val pregunta: String,
    val op1: String,
    val op2: String,
    val op3: String,
    val correctPregunta: Int
)