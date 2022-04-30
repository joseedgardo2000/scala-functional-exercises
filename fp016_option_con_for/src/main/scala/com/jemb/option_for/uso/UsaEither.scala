package com.jemb.option_for.uso

import com.jemb.option_for.general.Utilerias.obtieneEnteroEither

object UsaEither {
  private def usaEitherMatch():Unit = {
    println("------- usaEitherMatch -------")
    obtieneEnteroEither("5") match {
      case Right(n) => println(s"Entero: $n")
      case Left(f) => println(s"Suma - Falla: $f")
    }

    obtieneEnteroEither("5d") match {
      case Right(n) => println(s"Entero: $n")
      case Left(f) => println(s"Suma - Falla: $f")
    }
    println("------------------------------")
  }

  private def usaEitherFor():Unit = {
    println("------- usaEitherFor -------")
    val r01 = for {
      a <- obtieneEnteroEither("5")
      b <- obtieneEnteroEither("3")
    } yield a + b
    val r02 = for {
      a <- obtieneEnteroEither("5")
      b <- obtieneEnteroEither("3")
      c <- obtieneEnteroEither("2d")
    } yield a + b + c
    println(s"Res01: $r01")
    println(s"Res01: $r02")
    println("----------------------------")
  }

  def lanzaUsos():Unit = {
    usaEitherMatch()
    usaEitherFor()
  }
}
