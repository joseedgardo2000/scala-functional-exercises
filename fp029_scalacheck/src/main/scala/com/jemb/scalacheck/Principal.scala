package com.jemb.scalacheck

import com.jemb.scalacheck.utils.{MateUtils, Sumas}
// $COVERAGE-OFF$
object Principal {
  def main(args: Array[String]): Unit = {
    println("============= fp029_scalacheck =============")
    val obj = new MateUtils
    val a = obj.increaseRandomly(10)
    println(s"Incremento Random: $a")
    println(s"Sumas: ${Sumas.suma(4,5)}")
    println("============= ================ =============")
  }
}
// $COVERAGE-ON$
