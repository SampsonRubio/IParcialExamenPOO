package com.example.iparcialexamenpoo
fun menu(){
    println("Desea usar el ascensor")
    println("1)SI")
    println("2)NO")
    println("")
}

fun menuPisos(){
    println("Escoja un piso al cual ir ")
    println("0)DetenerElevador")
    println("1) Sotano 3 (S3)")
    println("2) Sotano 2 (S2)")
    println("3) Sotano 1 (S1)")
    println("4) Looby 1 (Piso 1)")
    println("5) Piso 2")
    println("6) Piso 3")
    println("7) Piso 4")
    println("8) Piso 5")
    println("9) Piso 6")
    println("10) Piso 7")
    println("11) Piso 8")
    println("12) Piso 9")
    println("13) Piso 10")
    println("14) Piso 11")
    println("15) Piso 12")
    println("")
}


fun AccionesElevador(){
    var pisoProcedencia = 0
    var pisoDestino = 0
    menuPisos()
    println("Ingrese su piso de procedencia")
    pisoProcedencia = readLine()!!.toInt()
    println("")
    println("Ingrese su piso destino")
    pisoDestino = readLine()!!.toInt()
    if (pisoDestino < 0 || pisoProcedencia < 0 || pisoDestino > 15 || pisoProcedencia > 15){
        println("Escoja un piso valido por favor")
        println("")
        menuPisos()
    }
    if(pisoDestino > pisoProcedencia){
        val elevadorUno = Elevador(pisoProcedencia,pisoDestino,EstadosElevador.ARRIBA)
    }
    if(pisoDestino < pisoProcedencia){
        val elevadorDos = Elevador(pisoProcedencia,pisoDestino,EstadosElevador.ABAJO)
    }
    if(pisoDestino == 0 || pisoProcedencia == 0){
        val elevadorDos = Elevador(pisoProcedencia,pisoDestino,EstadosElevador.DETENIDO)
    }



}

fun main()
{
    var opt = 0

    while (opt != 2){
        opt = readLine()!!.toInt()
        when (opt) {
            1 -> AccionesElevador()
            2 -> println("Adios")
        else -> {
            println("Debe escoger solo las opciones mostradas")
            menu()
            opt = readLine()!!.toInt()
            }
        }
    }
}