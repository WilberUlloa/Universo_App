package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_actividades.btn_selection
import kotlinx.android.synthetic.main.menu_actividades.btn_trueFalse

class Menu_actividades : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_selection.setOnClickListener{
            startActivity(Intent(this, Ex_selection::class.java))
        }
        btn_trueFalse.setOnClickListener{
            startActivity(Intent(this, Ejercicios_2::class.java))
        }
    }
}