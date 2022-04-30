package com.jemb.io_state.probadores

import com.jemb.io_state.enums.{PRU_GET_PUT, PRU_IO_FOR, PRU_PUSH, PruEnum}
import com.jemb.io_state.{Stack, getLine, push, putStrLn}
import com.jemb.io_state.traits.Probador

/*
   Este probador se encarga de demostrar el uso de las monadas de
   IO y State de forma individual.
 */
object Probador01 extends Probador{

  //-------------- Código de Pruebas --------------------

  def probarGetPut():Unit = {
    println("--------- probarGetPut ---------")
    putStrLn("Escriba una palabra: ").run
    val res = getLine.run
    putStrLn(s"Tu palabra fue: $res").run
  }

  def probarPush():Unit = {
    val pila00:Stack = List.empty
    println("--------- probarPush ---------")
    val edo01:(Stack, Unit) = push("hola").run(pila00)
    val edo02:(Stack, Unit) = push("Hola").run(
                                  push("mundo").run(
                                  push("mundano").run(pila00)
                              ._1)._1)

    println(s"Stack: $edo01")
    println(s"Stack: $edo02")
  }

  //---- Código de ejecución ------------------
  override
  def selPrueba(op: PruEnum): Unit = op match {
    case PRU_PUSH => probarPush()
    case PRU_GET_PUT => probarGetPut()
  }

  override
  def ejecutar():Unit = {
    println("---------- ejecutar ----------")

    selPrueba(PRU_IO_FOR)

    println("------------------------------")
  }
}

