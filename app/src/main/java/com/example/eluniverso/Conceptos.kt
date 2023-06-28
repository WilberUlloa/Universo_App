package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.conceptos.btn_regresar

class Conceptos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conceptos)

        btn_regresar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}