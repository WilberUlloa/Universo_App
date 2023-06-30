package com.example.eluniverso

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.ejercios_2.UI_enunciado
import kotlinx.android.synthetic.main.ejercios_2.UI_f
import kotlinx.android.synthetic.main.ejercios_2.UI_v
import kotlinx.android.synthetic.main.ejercios_2.imgIncorrect
import kotlinx.android.synthetic.main.ejercios_2.valid_btn2
import kotlinx.android.synthetic.main.ex_selection.UI_res_1
import kotlinx.android.synthetic.main.ex_selection.UI_res_2
import kotlinx.android.synthetic.main.ex_selection.UI_res_3
import kotlinx.android.synthetic.main.ex_selection.imgCorrect
import kotlinx.android.synthetic.main.ex_selection.valid_btn

class Ejercicios_2 : AppCompatActivity(), View.OnClickListener {

    private var aPosicionActual: Int = 1
    private var aListaEnunciados: ArrayList<VF>? = null
    private var aSeleccionPosicion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercios_2)

       aListaEnunciados = Argumentos.obtenerEnunciado()

        setEnunciado()

        UI_v.setOnClickListener(this)
        UI_f.setOnClickListener(this)
        valid_btn2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.UI_v ->{
                seleccion(UI_v, 1)
            }
            R.id.UI_f ->{
                seleccion(UI_f, 2)
            }
            R.id.valid_btn2 ->{
                if (aSeleccionPosicion == 0){
                    aPosicionActual++
                    when{
                        aPosicionActual <= aListaEnunciados!!.size ->{
                            setEnunciado()
                        }else ->{
                        Toast.makeText(this, "Actividad completada",
                            Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    val validador = aListaEnunciados?.get(aPosicionActual -1)
                    if (validador!!.respuesta != aSeleccionPosicion){
                        Identificador(aPosicionActual, R.drawable.op_incorrecta)
                        imgIncorrect.isInvisible = imgIncorrect.isVisible
                    }else{
                        Identificador(validador.respuesta, R.drawable.opcion_correcta)
                        imgCorrect.isInvisible = imgCorrect.isVisible
                    }

                    if (aPosicionActual == aListaEnunciados!!.size){
                        valid_btn2.text = "COMPLETADO"
                    }else{
                        valid_btn2.text = "SIGUIENTE"
                    }
                    aSeleccionPosicion = 0
                }
            }
        }
    }

    private fun setEnunciado(){

        val _enunciado = aListaEnunciados!![aPosicionActual -1]
        opcionVista()
        if (aPosicionActual == aListaEnunciados!!.size){
            valid_btn2.text = "COMPLETADO"
        }else{
            valid_btn2.text = "VALIDAR"
        }

        UI_enunciado.text = _enunciado!!.enunciado
    }

    private fun opcionVista(){
        val vf_opciones = ArrayList<TextView>()

        vf_opciones.add(UI_v)
        vf_opciones.add(UI_f)

        for (corre in vf_opciones){
            corre.setTextColor(Color.parseColor("#FF9933"))
            corre.typeface = Typeface.DEFAULT
            corre.background = ContextCompat.getDrawable(this, R.drawable.opcion_background_btn)
        }
    }

    private fun seleccion(tv: TextView, getEntero: Int){
        opcionVista()
        aSeleccionPosicion = getEntero
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
    }

    private fun Identificador(enunSelect: Int, drawView: Int){
        when(enunSelect){
            1 ->{
                UI_v.background = ContextCompat.getDrawable(
                    this, drawView
                )
            }
            2 ->{
                UI_f.background = ContextCompat.getDrawable(
                    this, drawView
                )
            }
        }
    }

}