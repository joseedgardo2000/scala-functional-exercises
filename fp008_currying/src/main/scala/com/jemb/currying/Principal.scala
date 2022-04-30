package com.jemb.currying

object Principal {
  def suma(a:Int, b:Int, c:Int):Int = {
    a + b + c
  }
  def main(args: Array[String]): Unit = {
    println("============= Currying =============")
    val curryFun = (suma _).curried
    val res01 = curryFun(4)(5)(1)
    val resA = curryFun(4) (_)
    val resB = resA(5) (_)
    val res02 = resB(1)

    println(s"Res01: $res01")
    println(s"Res02: $res02")
    println("============= ======== =============")
  }
}
