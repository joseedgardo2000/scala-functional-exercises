package com.jemb.es_monad.generales

import com.jemb.es_monad.monadas.ES

import scala.io.StdIn.readLine

object Utilerias {
  def leeEntrada(): ES[String] = ES(readLine())
  def imprimeTxt(s:String):ES[Unit] = ES(println(s))
}
