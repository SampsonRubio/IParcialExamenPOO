package com.example.iparcialexamenpoo

enum class EstadosElevador{
    ABAJO,ARRIBA,DETENIDO
}


class Elevador ( private var PisoA: Int, private var PisoD: Int, private var estado:EstadosElevador) {
    fun estadoElevador(){

        while (true){

            if (estado == EstadosElevador.ABAJO){
                bajar(PisoA,PisoD)
            }
            if (estado == EstadosElevador.ARRIBA){
                subir(PisoA,PisoD)
            }
            if(estado == EstadosElevador.DETENIDO){
                println("El elevador de encuentra DETENIDO en el lobby")
            }

        }
    }
fun bajar(PisoA: Int,PisoD: Int){
    println("Usted esta en $PisoA")
    var PisoE = PisoA
    while (PisoE > PisoD){
        PisoE--
        println("Estado del elevador ABAJO $PisoE")
    }
    println("Estado del elevador DETENIDO, en el piso $PisoD")
    println("El elevador ha llegado al piso indicado")
}
    fun subir(PisoA: Int,PisoD: Int){
        println("Usted esta en $PisoA")
        var PisoE = PisoA
        while (PisoE < PisoD){
            PisoE++
            println("Estado del elevador ARRIBA, piso $PisoE")
        }
        println("Estado del elevador DETENIDO, en el piso $PisoD")
        println("El elevador ha llegado al piso indicado")
    }


}


