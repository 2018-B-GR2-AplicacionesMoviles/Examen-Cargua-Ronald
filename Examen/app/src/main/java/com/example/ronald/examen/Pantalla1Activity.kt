package com.example.ronald.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla1.*

class Pantalla1Activity : AppCompatActivity() {

    var nombre = ""
    var apellido =""
    var cedula =""
    var telefono=""
    var direccion =""
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
        this.nombre = intent.getStringExtra("nombre")
        this.apellido = intent.getStringExtra("apellido")
        this.cedula = intent.getStringExtra("cedula")
        this.telefono = intent.getStringExtra("telefono")
        this.direccion = intent.getStringExtra("direccion")
        BaseDeDatos.agregarPersonas(Persona(this.nombre,this.apellido,this.cedula,this.telefono,this.direccion))
    }
}
