package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.conceptos.btn_regresar
import kotlinx.android.synthetic.main.home.btn_Conceptos

class Conceptos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conceptos)

        btn_regresar.setOnClickListener {
            startActivity(Intent(this, Conceptos::class.java))
        }
    }
}