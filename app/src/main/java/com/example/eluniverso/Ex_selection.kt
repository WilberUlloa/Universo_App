package com.example.eluniverso

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.ex_selection.UI_pregunta
import kotlinx.android.synthetic.main.ex_selection.UI_res_1
import kotlinx.android.synthetic.main.ex_selection.UI_res_2
import kotlinx.android.synthetic.main.ex_selection.UI_res_3
import kotlinx.android.synthetic.main.ex_selection.imgCorrect
import kotlinx.android.synthetic.main.ex_selection.imgIncorrect
import kotlinx.android.synthetic.main.ex_selection.valid_btn

class Ex_selection : AppCompatActivity(), View.OnClickListener {

    private var aPosicionActual: Int = 1
    private var aListaPregunas: ArrayList<Preguntas>? = null
    private var aSeleccionPosicion: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex_selection)

        aListaPregunas = Argumentos.obtenerPreguntas()
        setpregunta()

        UI_res_1.setOnClickListener(this)
        UI_res_2.setOnClickListener(this)
        UI_res_3.setOnClickListener(this)
        valid_btn.setOnClickListener(this)
    }

    private fun setpregunta(){

        val _pregunta = aListaPregunas!![aPosicionActual -1]

        opcionVista()
        if (aPosicionActual == aListaPregunas!!.size){
            valid_btn.text = "COMPLETADO"
        }else{
            valid_btn.text = "VALIDAR"
        }

        UI_pregunta.text = _pregunta!!.pregunta
        UI_res_1.text = _pregunta.op1
        UI_res_2.text = _pregunta.op2
        UI_res_3.text = _pregunta.op3
    }

    private fun opcionVista(){
        val opciones = ArrayList<TextView>()

        opciones.add(0, UI_res_1)
        opciones.add(1, UI_res_2)
        opciones.add(2, UI_res_3)

        for (UnaOption in opciones){
            UnaOption.setTextColor(Color.parseColor("#FF9933"))
            UnaOption.typeface = Typeface.DEFAULT
            UnaOption.background = ContextCompat.getDrawable(
                this, R.drawable.opcion_background_btn
            )
        }

    }

    private fun seleccionOpcion(tv: TextView, seleccionNum: Int){
        opcionVista()
        aSeleccionPosicion = seleccionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.UI_res_1 ->{
                seleccionOpcion(UI_res_1, 1)
            }
            R.id.UI_res_2 ->{
            seleccionOpcion(UI_res_2, 2)
            }
            R.id.UI_res_3 ->{
                seleccionOpcion(UI_res_3, 3)
            }
            R.id.valid_btn ->{
                if (aSeleccionPosicion == 0){
                    aPosicionActual++
                    when{
                        aPosicionActual <= aListaPregunas!!.size ->{
                            setpregunta()
                        }
                        else ->{
                            Toast.makeText(this, "Actividad completada",
                                Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                else{
                    val devolverPregunta = aListaPregunas?.get(aPosicionActual -1)

                    if (devolverPregunta!!.correctPregunta != aSeleccionPosicion){
                        RespuestaCorrecta(aSeleccionPosicion, R.drawable.op_incorrecta)
                        imgIncorrect.isInvisible = imgIncorrect.isVisible
                    }else{
                        RespuestaCorrecta(devolverPregunta.correctPregunta, R.drawable.opcion_correcta)
                        imgCorrect.isInvisible = imgCorrect.isVisible
                    }

                    if (aPosicionActual == aListaPregunas!!.size){
                        valid_btn.text = "COMPLETADO"
                    }else{
                        valid_btn.text = "SIGUIENTE"
                    }
                    aSeleccionPosicion = 0
                }
            }
        }

    }
        private fun RespuestaCorrecta(resp: Int, drawView: Int){
            when(resp){
                1 ->{
                    UI_res_1.background = ContextCompat.getDrawable(
                        this, drawView
                    )
                }
                2 ->{
                    UI_res_2.background = ContextCompat.getDrawable(
                        this, drawView
                    )
                }
                3 ->{
                    UI_res_3.background = ContextCompat.getDrawable(
                        this, drawView
                    )
                }
            }
        }
}