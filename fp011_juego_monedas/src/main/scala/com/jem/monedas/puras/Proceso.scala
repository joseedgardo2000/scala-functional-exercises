package com.jem.monedas.puras

import com.jem.monedas.impuras.Utilerias.{lanzaMoneda, menu, muestraEstado, muestraFinJuego, muestraOpciones}
import com.jem.monedas.tipos.EstadoJuego

import scala.annotation.tailrec
import scala.util.Random

object Proceso {
  @tailrec
  private def iniciaJuego(estadoJuego: EstadoJuego, random: Random):Unit = {
    val usrPred = menu()
    usrPred match {
      case "Águila" | "Sol" =>
        val edoNvo = procesaAguilaSol(usrPred, estadoJuego, random)
        iniciaJuego(edoNvo,random)
      case "X" => muestraFinJuego(estadoJuego)
    }
  }

  def procesaAguilaSol(usrPred:String, estadoJuego: EstadoJuego, random: Random)
    :EstadoJuego = {
    val resTiro = lanzaMoneda(random)
    val nvoNumTiros = estadoJuego.numTiros + 1
    val incAciertos = if(usrPred == resTiro) {1} else {0}
    val nvoNumAciertos = estadoJuego.numAciertos + incAciertos
    val nvoEdo = estadoJuego.copy(nvoNumTiros, nvoNumAciertos)
    muestraEstado(resTiro, usrPred, nvoEdo)
    nvoEdo
  }

  def lanzaJuego():Unit = {
    val edo = EstadoJuego(0, 0)
    val rnd = new Random()
    iniciaJuego(edo, rnd)
  }
}
