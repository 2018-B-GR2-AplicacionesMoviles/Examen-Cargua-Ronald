package com.example.ronald.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_pantalla1.setOnClickListener {
            this.irAPantalla1()
        }
        button2_pantalla2.setOnClickListener {
            this.irAPantalla2()
        }
    }
    fun irAPantalla1(){
        val intentRespuesta1 = Intent(this,Pantalla1Activity::class.java)
        this.startActivity(intentRespuesta1)
    }
    fun irAPantalla2(){
        val intentRespuesta2 = Intent(this, Pantalla2Activity::class.java)
        this.startActivity(intentRespuesta2)
    }
}
