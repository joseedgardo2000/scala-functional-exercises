package com.jemb.es_monad.generales

import com.jemb.es_monad.generales.Utilerias.{imprimeTxt, leeEntrada}
import com.jemb.es_monad.monadas.ES

object ProbadorES {

  private def pru01():Unit = for {
    _   <- imprimeTxt("Nombres: ")
    nom <- leeEntrada()
    _   <- imprimeTxt("Apellidos: ")
    ape <- leeEntrada()
    _   <- imprimeTxt(s"Nombre completo: $nom $ape")
  } yield()

  private def pru02():ES[String] = for {
    _   <- imprimeTxt("Nombres: ")
    nom <- leeEntrada()
    _   <- imprimeTxt("Apellidos: ")
    ape <- leeEntrada()
    nomc = nom + " " + ape
    _   <- imprimeTxt(nomc)

  } yield nomc

  def ejecutor():Unit = {
    println("------- lanzaPruebas -------")
    pru01()
    println("----------------------------")
    val res:String = pru02().ejecutar
    println(s"Res: $res")
    println("------- ------------ -------")
  }
}
