package com.example.eluniverso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.home.btn_Conceptos
import kotlinx.android.synthetic.main.home.btn_Creditos
import kotlinx.android.synthetic.main.home.btn_Ejercicios

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1500)
        setTheme(R.style.Theme_Eluniverso)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Conceptos.setOnClickListener {
            startActivity(Intent(this, Conceptos::class.java))
        }

        btn_Ejercicios.setOnClickListener {
            startActivity(Intent(this, Ejercicios::class.java))
        }

        btn_Creditos.setOnClickListener {
            startActivity(Intent(this, Creditos::class.java))
        }
    }
}