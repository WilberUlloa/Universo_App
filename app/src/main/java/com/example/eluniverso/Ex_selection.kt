package com.example.eluniverso

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ex_selection.UI_pregunta
import kotlinx.android.synthetic.main.ex_selection.UI_res_1
import kotlinx.android.synthetic.main.ex_selection.UI_res_3

class Ex_selection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex_selection)

        val posicionList = 1
        val _listaPreguntas = Argumentos.obtenerPreguntas()
        val _pregunta: Preguntas? = _listaPreguntas[posicionList -1]

        UI_pregunta.text = _pregunta!!.pregunta
        UI_res_1.text = _pregunta.op1
        UI_res_1.text = _pregunta.op2
        UI_res_3.text = _pregunta.op3
    }
}