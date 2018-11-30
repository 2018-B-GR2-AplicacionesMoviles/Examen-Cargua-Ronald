package com.example.ronald.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla3.*
import java.time.Instant

class Pantalla3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla3)
        button3_Cancelar.setOnClickListener {
            this.irAPantalla2()
        }
    }
    fun irAPantalla2(){
        var intenteRespuesta = Intent(this, Pantalla2Activity::class.java)
        this.startActivity(intenteRespuesta)
    }
}
