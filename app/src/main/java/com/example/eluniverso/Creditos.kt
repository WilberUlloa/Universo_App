package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.creditos.btn_regresar2
import kotlinx.android.synthetic.main.home.btn_Conceptos

class Creditos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creditos)

        btn_regresar2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
