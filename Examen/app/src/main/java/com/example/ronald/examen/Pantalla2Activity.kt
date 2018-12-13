package com.example.ronald.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_pantalla2.*

class Pantalla2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
        val adapter = ArrayAdapter<Persona>(
                this,
                android.R.layout.simple_list_item_1,
                BaseDeDatos.Persona)
        lista.adapter = adapter;
        lista.onItemClickListener = OnItemClickListener { parent, view, position, id ->

            val personaSeleccionada = parent.getItemAtPosition(position)as Persona
            val intentPersonaSeleccionada = Intent(this, Pantalla3Activity::class.java)
            intentPersonaSeleccionada.putExtra("Persona",personaSeleccionada)
            startActivity(intentPersonaSeleccionada)
        }
    }
}



