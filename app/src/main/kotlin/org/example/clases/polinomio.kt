package org.example.clases
import org.example.clases.Termino
open class Polinomio(var terminos:List <Termino>){
    override fun toString(): String{
        return "$terminos"
    }
}