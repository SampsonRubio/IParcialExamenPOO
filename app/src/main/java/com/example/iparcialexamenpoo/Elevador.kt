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
                println("El elevador se encuentra DETENIDO")
            }

        }
    }
fun bajar(PisoA: Int,PisoD: Int){
    println("Usted esta en $PisoA")
    var PisoE = PisoA
    while (PisoE > PisoD){
        PisoE--
        println("Usted a bajado al $PisoE")
    }
    println("A llegado a destino usted, esta en el piso $PisoD")
}
    fun subir(PisoA: Int,PisoD: Int){
        println("Usted esta en $PisoA")
        var PisoE = PisoA
        while (PisoE < PisoD){
            PisoE++
            println("Usted a subido al $PisoE")
        }
        println("A llegado a destino, usted esta en el piso $PisoD")
    }


}


