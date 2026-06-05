package org.example.clases
import org.example.clases.Fecha
class Persona(private var name: String="", private var sname: String="", private var fregistro: Fecha=Fecha(0,0,0) ) {   
    override fun toString() : String {
        return " Persona(nombre=${name}, apellido=${sname}), Fecha: ${fregistro}"
    }
}