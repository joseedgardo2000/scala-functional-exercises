package com.jemb.option_for.uso

import com.jemb.option_for.general.Utilerias.obtieneEnteroOption

object UsaOption {
  private def  usaOptionMatch():Unit = {
    println("------- usaOptionMatch -------")
    obtieneEnteroOption("5") match {
      case Some(n) => println(s"Entero: $n")
      case None => println("No se pudo obtener un entero")
    }

    obtieneEnteroOption("d5") match {
      case Some(n) => println(s"Entero: $n")
      case None => println("No se pudo obtener un entero")
    }
    println("------- -------------- -------")
  }

  private def usaOptionFor():Unit = {
    println("------- usaOptionFor -------")
    val r01 = for{
      a <- obtieneEnteroOption("5")
      b <- obtieneEnteroOption("3")
    } yield a + b
    val r02 = for{
      a <- obtieneEnteroOption("5")
      b <- obtieneEnteroOption("3")
      c <- obtieneEnteroOption("4d")
    } yield a + b + c
    r01 match {
      case Some(r) => println(s"Res: $r")
      case None => println("Res: None: No hubo forma de realizar la suma")
    }
    r02 match {
      case Some(r) => println(s"Res: $r")
      case None => println("Res: None: No hubo forma de realizar la suma")
    }

    println("------- ------------ -------")
  }

  def lanzaUsos():Unit = {
    usaOptionMatch()
    usaOptionFor()
  }
}
