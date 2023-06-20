package com.example.eluniverso

object Argumentos {
    fun obtenerPreguntas(): ArrayList<Preguntas>{
        val ListaPreguntas = ArrayList<Preguntas>()

        val preg1 = Preguntas(
            1, "El Sistema Solar es:",
            "El Sol y los planetas que giran a su alrededor",
            "Un conjunto de soles",
            "Un sistema energético en equilibrio",
            1)
        ListaPreguntas.add(preg1)

        val preg2 = Preguntas(
            1, "La materia se distribuye en:",
            "Galaxias", "Estrellas", "Nebulosas", 1)
        ListaPreguntas.add(preg2)

        val preg3 = Preguntas(
            1, "La teoría que dice que el origen del universo fue por medio de una gran explosión es:",
            "La de la Biblia", "La del Big Bang", "La de hoyos negros",
            2)
        ListaPreguntas.add(preg3)

        val preg4 = Preguntas(
            1, "¿Cómo se llama nuestra Galaxia?",
            "Espiral", "Elíptica", "Vía láctea",
            3)
        ListaPreguntas.add(preg4)

        val preg5 = Preguntas(
            1, "El movimiento de rotación de nuestro planeta genera:",
            "El día y la noche", "Templores y Huracanes", "Dos meses del año",
            1)
        ListaPreguntas.add(preg5)

        return ListaPreguntas
    }
}