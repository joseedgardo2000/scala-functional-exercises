package com.jemb.habilitar_for_exp

import com.jemb.habilitar_for_exp.tipos.Secuencia

object Principal {

  val d01: Secuencia[Int] = Secuencia(1, 2, 3)
  val d02: Secuencia[String] = Secuencia("aa", "bb", "cc")
  val d03: Secuencia[Char] = Secuencia('a', 'b', 'c', 'd')
  val d04: Secuencia[Secuencia[Int]] =
    Secuencia(Secuencia(1, 2), Secuencia(3, 4))
  val d05: Secuencia[Any] =
    Secuencia(0, Secuencia(1, 2), Secuencia(3, 4), 5)

  def muestraDatos(): Unit = {
    println("----- muestraDatos -----")
    println(d01)
    println(d02)
    println(d03)
    println("------------------------")
  }

  def usaSecuenciaGenerador(): Unit = {
    println("----- usaSecuencia -----")
    for (e <- d03) print(s"$e ")
    println("---------")
    for (i <- d01; j <- d02) println(s"$i - $j")
    println("------------------------")
  }

  def usaSecuenciaYield(): Unit = {
    println("----- usaSecuenciaYield -----")
    val d01b = for (e <- d01) yield e * 2
    println(s"Original:  $d01")
    println(s"Procesado: $d01b")
    println("-----------------------------")
  }

  def usaSecuenciaFilter(): Unit = {
    println("----- usaSecuenciaFilter -----")
    val d01b = for (e <- d01; if e % 2 != 0) yield e
    println(s"Original:  $d01")
    println(s"Filtrado impares: $d01b")
    println("------------------------------")
  }

  def usaFlatten():Unit = {
    println("----- usaFlatten -----")
    println(d04.flatten)
    println(d05.flatten)
    println("----------------------")
  }

  def usaMultiGeneradores():Unit = {
    println("----- usaSecuenciaFilter -----")
    for(e01 <- d01; e02 <- d02) println(s"($e01, $e02)")
    val d01b = for(e01 <- d01; e02 <- d02) yield (e01, e02)
    val d01c = for(e01 <- d01; e02 <- d05) yield (e01, e02)
    println(s"Original:  $d01")
    println(s"Multi-Generado: $d01b")
    println(s"Multi-Generado: $d01c")
    println("----- ------------------ -----")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp015_habilitar_for_exp =============")
    muestraDatos()
    usaSecuenciaGenerador()
    usaSecuenciaYield()
    usaSecuenciaFilter()
    usaFlatten()
    usaMultiGeneradores()
    println("============= ======================= =============")
  }
}
