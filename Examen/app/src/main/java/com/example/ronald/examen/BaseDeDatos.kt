package com.example.ronald.examen

class BaseDeDatos{
    companion object {
        val Persona: ArrayList<Persona> = ArrayList()
        fun agregarPersonas (personas:Persona){
            Persona.add(personas)
        }
    }

}
class Persona(val nombre: String, val apellido: String, val cedula: String, val telefono: String, val direccion:String){
    override fun toString(): String{
        return "nombre:  ${this.nombre} apellido: ${this.apellido} cedula: ${this.cedula} telefono: ${this.telefono} direccion: ${direccion}"
    }
}