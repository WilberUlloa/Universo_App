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

    fun obtenerEnunciado(): ArrayList<VF>{
        val ListaEnunciados = ArrayList<VF>()

        val enun1 = VF(
            1,
            "El universo es una gran extensión del espacio que contiene toda la materia y energía que existe",
            1)
        ListaEnunciados.add(enun1)

        val enun2 = VF(
            2,
        "La vía láctea se compone de una serie de cuerpos celestes que orbitan alrededor del sol",
        1)
        ListaEnunciados.add(enun2)

        val enun3 = VF(
            3,
            "El planeta Marte es el más pequeño del Sistema Solar",
            2)
        ListaEnunciados.add(enun3)

        val enun4 = VF(
            4,
            "Neptuno es el octavo planeta en distancia al Sol y el más lejano del Sistema solar",
            2)
        ListaEnunciados.add(enun4)

        val enun5 = VF(
            5,
            "10 planetas conforman el sistema solar",
            2)
        ListaEnunciados.add(enun5)

        return ListaEnunciados
    }
}