package com.example.ronald.examen

class BaseDeDatos{
    companion object {
        val Persona: ArrayList<Persona> = ArrayList()
        fun agregarPersonas (personas:Persona){
            Persona.add(personas)
        }

        fun actualizarPersonas(personas: Persona){
            Persona.forEach{
                if (it.nombre.equals(personas.nombre)){
                    it.apellido = personas.apellido
                    it.cedula = personas.cedula
                    it.telefono = personas.telefono
                    it.direccion = personas.direccion
            }
        }
        }
        fun eliminarPersonas(nombre: String ){
            for (i in Persona.indices){
                if (Persona[i].nombre.equals(nombre)){
                    Persona.removeAt(i)
                }
            }
        }

    }

}
