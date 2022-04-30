package com.jemb.recursion

import scala.annotation.tailrec

object Principal {
  //------- Prueba01 ----------------------
  // Puede provocar Stack Overflow Error
  def suma01(nums:List[Int]):Int = nums match {
    case Nil => 0
    case head::tail => head + suma01(tail)
  }
  def recursion01():Unit = {
    println("-------- recursion01 --------")
    val nums01 = List(1,2,3)
    val nums02 = List(1,2,3,4)
    println(s"Suma: ${suma01(nums01)}")
    println(s"Suma: ${suma01(nums02)}")
    println("-----------------------------")
  }
  //---------------------------------------
  //------- Prueba02 ----------------------
  // Puede provocar Stack Overflow Error
  def suma02(nums:List[Int]):Int = nums match {
    case Nil =>
      println("case 1:\t\t0")
      0
    case x::xs =>
      println(s"case 2:\t\t$x + $xs")
      x + suma02(xs)
  }

  def recursion02():Unit = {
    val nums01 = List(1,2,3)
    println("-------- recursion01 --------")
    val res = suma02(nums01)
    println(s"Resultado:\t$res")
    println("-----------------------------")
  }

  def provocaStackOverflowError():Unit = {
    println("---------- provocaStackOverflowError ----------")
    try {
      val nums = List.range(1, 7500)
      val res = suma01(nums)
      println(s"Resultado: $res")
    } catch {
      case e:Throwable => e.printStackTrace()
      case _ => println("Error desconocido")
    }
    println("---------- ------------------------- ----------")
  }
  //---------------------------------------
  //------- Prueba03 ----------------------
  /*

  // Esto provoca error porque la recursion no está
  // en una posición TailRec

  @tailrec
  def suma03(nums:List[Int]):Int = nums match {
    case Nil => 0
    case x::xs => x + suma03(xs)
  }
  */
  //---------------------------------------
  //------- Prueba04 ----------------------
  def suma04(nums:List[Int]):Int = {
    @tailrec
    def sumaConAcc(nums:List[Int], acc:Int): Int = nums match {
      case Nil => acc
      case x::xs => sumaConAcc(xs, x + acc)
    }
    sumaConAcc(nums,0)
  }

  def noCausaStackOverflowError():Unit = {
    println("-------- recursion01 --------")
    val nums01 = List(1,2,3)
    val nums02 = List(1,2,3,4)
    println(s"Suma: ${suma04(nums01)}")
    println(s"Suma: ${suma04(nums02)}")
    println(s"Suma: ${suma04(List.range(1,20000))}")
    println("-----------------------------")
  }
  //---------------------------------------
  def main(args: Array[String]): Unit = {
    println("============= fp010_recursion =============")
    recursion01()
    recursion02()
    //provocaStackOverflowError()
    noCausaStackOverflowError()
    println("============= =============== =============")
  }
}
