package com.jemb.listas

object Principal {

  def listas01():Unit = {
    val l01 = List(1,2,3)
    val l02 = 1::2::3::Nil
    println(s"Lista: $l01")
    println(s"Lista: $l02")
    println(s"Listas iguales: ${l01==l02}")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp009_Listas =============")
    listas01()
    println("============= ======== =============")
  }
}
