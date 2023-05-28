package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ejercios_2.btn_regresar2

class Ejercicios_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercios_2)

        btn_regresar2.setOnClickListener {
            startActivity(Intent(this, Ejercicios_2::class.java))
        }

    }
}