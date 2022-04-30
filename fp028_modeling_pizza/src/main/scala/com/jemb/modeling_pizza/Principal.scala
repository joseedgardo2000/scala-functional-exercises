package com.jemb.modeling_pizza

import com.jemb.modeling_pizza.enums.{PROBADOR01, PROBADOR02, ProbadorEnum}
import com.jemb.modeling_pizza.model01.Probador01
import com.jemb.modeling_pizza.model02.Probador02

object Principal {

  def selecProbador(op:ProbadorEnum):Unit = op match {
    case PROBADOR01 => Probador01.ejecutar()
    case PROBADOR02 => Probador02.ejecutar()
  }

  def ejecutar():Unit = {
    selecProbador(PROBADOR02)
  }

  def main(args: Array[String]): Unit = {
    println("============= fp028_modeling_pizza =============")
    ejecutar()
    println("============= ==================== =============")
  }
}
