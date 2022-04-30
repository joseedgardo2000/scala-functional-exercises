package com.jemb.fun_parcial

object Principal {

  def suma01(a:Int, b:Int, c:Int):Int = {
    a + b + c
  }

  def parcial01():Unit = {
    println("--------- parcial01() ---------")
    val par01 = suma01(5, _, _)
    val par02 = par01(4, _)
    val res = par02(1)
    println(s"Resultado: $res")
    println("--------- ----------- ---------")
  }

  def suma02(a:Int)(b:Int)(c:Int):Int = {
    a + b + c
  }

  def parcial02():Unit = {
    println("--------- parcial02() ---------")
    val par01 = suma02(5)(_:Int)(_:Int)
    //val par02 = par01(4, _)
    val par02 = par01(4) (_)
    val res = par02(1)
    println(s"Resultado: $res")
    println("--------- ----------- ---------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp007_partially_applied_functions =============")
    parcial01()
    parcial02()
    println("============= ======== =============")
  }
}
