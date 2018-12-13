package com.example.ronald.examen

import android.os.Parcel
import android.os.Parcelable

class Persona(var nombre: String,
              var apellido: String,
              var cedula: String,
              var telefono: String,
              var direccion:String): Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeString(cedula)
        parcel.writeString(telefono)
        parcel.writeString(direccion)
    }

    override fun toString(): String {
        return "Nombre: ${nombre}"+"\nApellido: ${apellido}"+"\nCedula: ${cedula}"+"\nTelefono:${telefono}"+"\nDireccion:${direccion}"
    }
    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Persona> {
        override fun createFromParcel(parcel: Parcel): Persona {
            return Persona(parcel)
        }

        override fun newArray(size: Int): Array<Persona?> {
            return arrayOfNulls(size)
        }
    }

}