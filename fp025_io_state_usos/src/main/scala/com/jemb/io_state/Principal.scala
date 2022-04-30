package com.jemb.io_state

import com.jemb.io_state.enums.{PROBADOR01, PROBADOR02, PROBADOR03, PROBADOR04, ProbadorEnum}
import com.jemb.io_state.probadores.{Probador01, Probador02, Probador03}

object Principal {

  def ejecutar(op:ProbadorEnum):Unit = op match {
    case PROBADOR01 => Probador01.ejecutar()
    case PROBADOR02 => Probador02.ejecutar()
    case PROBADOR03 => Probador03.ejecutar()
    case PROBADOR04 => println("Codificación pendiente...")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp025_IO_State_Juntas =============")
    ejecutar(PROBADOR04)
    println("============= ===================== =============")
  }
}
