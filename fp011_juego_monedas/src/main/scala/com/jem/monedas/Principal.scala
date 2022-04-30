package com.jem.monedas

import com.jem.monedas.puras.Proceso.lanzaJuego
import com.jem.monedas.tipos.EstadoJuego

import scala.util.Random

object Principal {


  def main(args: Array[String]): Unit = {
    println("============= fp011_juego_monedas =============")
    lanzaJuego()
    println("============= ======== =============")
  }
}
