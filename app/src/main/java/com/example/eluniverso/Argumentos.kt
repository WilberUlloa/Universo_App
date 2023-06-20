package com.example.eluniverso

object Argumentos {
    fun obtenerPreguntas(): ArrayList<Preguntas>{
        val ListaPreguntas = ArrayList<Preguntas>()

        val preg1 = Preguntas(
            1, "¿Qué lenguaje de Programación usa más .Net?",
            "C#", "Python", "VB", 1)
            ListaPreguntas.add(preg1)

        val preg2 = Preguntas(
            1, "¿Cómo se llama la capital de Nicaragua?",
            "León", "Estelí", "Managua", 3)
        ListaPreguntas.add(preg2)

        val preg3 = Preguntas(
            1, "¿En qué fecha se celebra la inpendencia de CA?",
            "14 de febrero", "15 de septiembre", "12 de octubre", 2)
        ListaPreguntas.add(preg3)

        val preg4 = Preguntas(
            1, "¿Cómo se llama la empresa que creó Windows?",
            "Apple", "Amazon", "Microsoft", 3)
        ListaPreguntas.add(preg4)

        return ListaPreguntas
    }
}