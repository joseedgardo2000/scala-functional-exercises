package com.jemb.hof

object Principal {

  def ejecOperacion(operante: (Int, Int) => Int, a:Int, b:Int):Int = {
    operante(a,b).toInt
  }

  def main(args: Array[String]): Unit = {
    val suma = (a:Int, b:Int) => a + b
    val resta = (a:Int, b:Int) => a - b
    val multiplicacion = (a:Int, b:Int) => a * b
    val division = (a:Int, b:Int) => a / b

    println("============= jem005_Higher_Order_Functions =============")
    println(ejecOperacion(suma, 5, 4))
    println(ejecOperacion(resta, 5, 4))
    println(ejecOperacion(multiplicacion, 5, 4))
    println(ejecOperacion(division, 5, 4))
    println("============= ============================= =============")
  }
}
