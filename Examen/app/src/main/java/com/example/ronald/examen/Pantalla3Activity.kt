package com.example.ronald.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_pantalla1.*
import kotlinx.android.synthetic.main.activity_pantalla3.*
import java.time.Instant

class Pantalla3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla3)
       val personaRecivida = intent.getParcelableExtra<Persona?>("Persona")
        var nom = personaRecivida!!.nombre.toString()
        Log.i("Datos", nom)

        nombreP3.setText("Ronald")
        /*nombreP3.setText(personaRecivida!!.nombre.toString())
        apellidoP3.setText(personaRecivida!!.apellido.toString())
        cedulaP3.setText(personaRecivida!!.cedula.toString())
        telefonoP3.setText(personaRecivida!!.telefono.toString())
        direccion.setText(personaRecivida!!.direccion.toString())*/
        button3_Cancelar.setOnClickListener {
            this.irAPantalla2()
        }
        button_Borrar.setOnClickListener {
            eleminar()
            irAMain()
        }
        button_Actualizar.setOnClickListener {
            actualizar(nombreP3.text.toString(),apellidoP3.text.toString(),cedulaP3.text.toString(),telefonoP3.text.toString(),direccionP3.text.toString())
            irAPantalla2()
        }
    }
    fun irAMain(){
        val intentRespuesta = Intent(this,MainActivity::class.java)
        startActivity(intentRespuesta)
    }
    fun actualizar(nombre: String, apellido:String,cedula:String,telefono:String,direccion:String){
        val persona = Persona(nombre= nombre,apellido = apellido,cedula = cedula,telefono = telefono,direccion = direccion)
        BaseDeDatos.actualizarPersonas(persona)

    }
    fun irAPantalla2(){
        var intenteRespuesta = Intent(this, Pantalla2Activity::class.java)
        this.startActivity(intenteRespuesta)
    }
    fun eleminar (){
        BaseDeDatos.eliminarPersonas(nombreP3.text.toString())
    }
}
