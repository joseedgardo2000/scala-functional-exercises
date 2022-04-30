package com.jemb.modeling

import com.jemb.modeling.enums.{PRU01, PruebaEnum}
import com.jemb.modeling.objetos.perro.Salchicha

object Principal {

  def pruebaModeloPerro():Unit = {
    println("---------- pruebaModeloPerro ----------")
    Salchicha.moverCola()
    Salchicha.ladrar()
  }

  def selecPruebas(op:PruebaEnum):Unit = op match {
    case PRU01 => pruebaModeloPerro()
  }

  def main(args: Array[String]): Unit = {
    println("============= fp027_modeling_dog =============")
    selecPruebas(PRU01)
    println("============= ================== =============")
  }
}
