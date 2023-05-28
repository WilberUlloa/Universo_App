package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ejercicios.btn_regresar

class Ejercicios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicios)

        btn_regresar.setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }

    }
}