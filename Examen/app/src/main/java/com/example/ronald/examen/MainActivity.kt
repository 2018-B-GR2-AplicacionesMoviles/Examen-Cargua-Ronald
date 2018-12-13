package com.example.ronald.examen

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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
        this.startActivityForResult(intentRespuesta1,reqCodeCrear)
    }
    fun irAPantalla2(){
        val intentRespuesta2 = Intent(this, Pantalla2Activity::class.java)
        this.startActivity(intentRespuesta2)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            reqCodeCrear->{
                when (resultCode){
                    RESULT_OK->{
                        CrearPersona(data!!.getStringExtra("nombre"),
                                data!!.getStringExtra("apellido"),
                                data!!.getStringExtra("cedula"),
                                data!!.getStringExtra("telefono"),
                                data!!.getStringExtra("direccion"))
                    }
                    RESULT_CANCELED->{
                        Log.i("Error", "Error no ingreso ")
                    }
                }
            }
            else -> {
                Log.e("--", "--")
            }
        }
    }
    fun CrearPersona(nombre: String, apellido: String, cedula: String, telefono:String,dirreccion:String): Unit {
        val _perosona: Persona = Persona(nombre,apellido,cedula,telefono,dirreccion)
        BaseDeDatos.Persona.add(_perosona)
    }
    companion object {
        val reqCodeCrear = 100
    }
}
