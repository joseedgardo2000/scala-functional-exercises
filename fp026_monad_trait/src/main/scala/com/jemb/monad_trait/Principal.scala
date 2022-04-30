package com.jemb.monad_trait

import com.jemb.monad_trait.enums.{PROBADOR01, PROBADOR02, PROBADOR03, PROBADOR04, PROBADOR05, ProbadorEnum}
import com.jemb.monad_trait.probadores.{Probador01, Probador02, Probador03, Probador04, Probador05}

object Principal {


  def ejecutar(op:ProbadorEnum):Unit = op match {
    case PROBADOR01 => Probador01.ejecutar()
    case PROBADOR02 => Probador02.ejecutar()
    case PROBADOR03 => Probador03.ejecutar()
    case PROBADOR04 => Probador04.ejecutar()
    case PROBADOR05 => Probador05.ejecutar()
  }

  def main(args: Array[String]): Unit = {

    println("============= fp026_monad_trait =============")
    ejecutar(PROBADOR04)
    println("============= ================= =============")
  }




}
