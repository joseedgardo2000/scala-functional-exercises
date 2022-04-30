package com.jemb.fp002_fun_literal

object Principal {
  def funcImplicitas():Unit = {
    println("-------------- funcImplicitas --------------")

    //val esPar00 = i: Int => i % 2 == 0  // Genera error
    val esPar01 = (i: Int) => i % 2 == 0
    val esPar02 = (i:Int) => {i % 2 == 0}
    val esPar03 = (i: Int) => if (i % 2 == 0) true else false
    val esPar04 = (i: Int) => { if (i % 2 == 0) true else false }

    println("Es par: " + esPar01(5))
    println("Es par: " + esPar02(5))
    println("Es par: " + esPar03(5))
    println("Es par: " + esPar04(5))
    println("-------------- -------------- --------------")
  }

  def funcExplicitas():Unit = {
    println("-------------- funcExplicitas --------------")
    val esPar01: (Int) => Boolean = i => i % 2 == 0
    val esPar02: (Int) => Boolean = (i) => i % 2 == 0
    val esPar03: (Int) => Boolean = i => { i % 2 == 0 }
    val esPar04: (Int) => Boolean = (i) => { i % 2 == 0 }
    val esPar05: (Int) => Boolean = i => { if (i % 2 == 0) true else false }
    val esPar06: (Int) => Boolean = (i) => { if (i % 2 == 0) true else false }
    val esPar07: (Int) => Boolean =
      (i) => {if (i % 2 == 0) { true } else { false }}

    println("Es par: " + esPar01(6))
    println("Es par: " + esPar02(6))
    println("Es par: " + esPar03(6))
    println("Es par: " + esPar04(6))
    println("Es par: " + esPar05(6))
    println("Es par: " + esPar06(6))
    println("Es par: " + esPar07(6))

    println("-------------- -------------- --------------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp002_fun-literal =============")
    funcImplicitas()
    funcExplicitas()
    println("============= ================= =============")
  }
}
