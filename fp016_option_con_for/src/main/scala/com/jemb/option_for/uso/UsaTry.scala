package com.jemb.option_for.uso

import com.jemb.option_for.general.Utilerias.{obtieneEnteroOption, obtieneEnteroTry}
import com.jemb.option_for.uso.UsaOption.{usaOptionFor, usaOptionMatch}

import scala.util.{Failure, Success, Try}

object UsaTry {
  private def usaTryMatch():Unit = {
    println("------- usaTryMatch -------")
    obtieneEnteroTry("5") match {
      case Success(n) => println(s"Entero: $n")
      case Failure(e) => println(s"Falla: $e")
    }

    obtieneEnteroTry("5d") match {
      case Success(n) => println(s"Entero: $n")
      case Failure(e) => println(s"Falla: $e")
    }
    println("------- ------------ -------")
  }

  private def usaTryFor():Unit = {
    println("------- usaTryFor -------")

    val r01 = for{
      a <- obtieneEnteroTry("5")
      b <- obtieneEnteroTry("3")
    } yield a + b

    val r02 = for{
      a <- obtieneEnteroTry("5")
      b <- obtieneEnteroTry("3")
      c <- obtieneEnteroTry("2d")
    } yield a + b + c

    r01 match {
      case Success(r) => println(s"Res: $r")
      case Failure(e) => println(s"Falla: $e")
    }

    r02 match {
      case Success(r) => println(s"Res: $r")
      case Failure(e) => println(s"Suma imposible: $e")
    }

    val r03 = for{
      a <- Try("5".toInt)
      b <- Try("3".toInt)
      c <- Try("2".toInt)
    } yield a + b + c

    val r04 = for{
      a <- Try("5".toInt)
      b <- Try("3d".toInt)
      c <- Try("2".toInt)
    } yield a + b + c

    println(s"Res03: $r03")
    println(s"Res04: $r04")

    println("------- --------- -------")
  }

  def lanzaUsos():Unit = {
    usaTryMatch()
    usaTryFor()
  }
}
