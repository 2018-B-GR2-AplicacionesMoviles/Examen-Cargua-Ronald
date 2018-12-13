package com.example.ronald.examen

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla1.*

class Pantalla1Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)
        button_Guardar.setOnClickListener {
            this.capturarDatosDelIntent()
        }
        button_Cancelar.setOnClickListener {
            this.irAMain()
        }

    }
    fun irAMain(){
        var intentRespueta = Intent(this, MainActivity::class.java)
        this.startActivity(intentRespueta)
    }
    fun capturarDatosDelIntent() {
        val nombre = nombre.text.toString()
        val apellido =apellido.text.toString()
        val cedula =cedula.text.toString()
        val telefono=telefono.text.toString()
        val direccion =direccion.text.toString()
        val intentRespuesta = Intent()
        intentRespuesta.putExtra("nombre",nombre)
        intentRespuesta.putExtra("apellido",apellido)
        intentRespuesta.putExtra("cedula",cedula)
        intentRespuesta.putExtra("telefono",telefono)
        intentRespuesta.putExtra("direccion",direccion)
        this.setResult(Activity.RESULT_OK,intentRespuesta)
        this.finish()

    }
}
