package com.example.eluniverso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.screen_final.regresar_btn

class Screen_final : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_final)

        regresar_btn.setOnClickListener {
            startActivity(Intent(this, Menu_actividades::class.java))
        }
    }
}