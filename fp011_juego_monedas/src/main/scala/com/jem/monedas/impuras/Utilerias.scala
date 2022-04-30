package com.jem.monedas.impuras

import com.jem.monedas.tipos.EstadoJuego

import scala.annotation.tailrec
import scala.io.StdIn.readLine
import scala.util.Random

object Utilerias {

  private def muestraOpciones():Unit = {
    println
    println("[A]: Águila")
    println("[S]: Sol")
    println("[X]: Salir")
    print(">> ")
  }

  private def muestraErrorOpcion(opc:String):Unit = {
    Console.err.println(s"[$opc] Opción Inexistente\n")
  }

  @tailrec
  def menu():String = {
    muestraOpciones()
    val op = readLine.trim.toUpperCase()
    op match {
      case "A" => "Águila"
      case "S" => "Sol"
      case "X" => op
      case _ =>
        muestraErrorOpcion(op)
        menu()
    }
  }

  def lanzaMoneda(r:Random):String = r.nextInt(2) match {
    case 0 => "Águila"
    case 1 => "Sol"
  }

  def muestraFinJuego(estadoJuego: EstadoJuego):Unit = {
    println(">>>> Juego terminado <<<<")
    println(">>>>>> Resultados <<<<<<<")
    print(s"Num. Tiros: ${estadoJuego.numTiros} -- ")
    println(s"Num. Aciertos: ${estadoJuego.numAciertos}")
  }

  def muestraEstado(estadoJuego: EstadoJuego):Unit = {
    print(s"Num. Tiros: ${estadoJuego.numTiros} -- ")
    println(s"Num. Aciertos: ${estadoJuego.numAciertos}")
  }

  def muestraEstado(tiro:String, opcionSel:String, estadoJuego: EstadoJuego):Unit = {
    println(s"El tiro es: $tiro - La seleccion fue: $opcionSel")
    muestraEstado(estadoJuego)
  }
}
