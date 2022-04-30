package com.jemb.option_for.general

import scala.util.Try

object Utilerias {

  def obtieneEnteroTry(numero:String):Try[Int] = Try {
    numero.trim.toInt
  }

  def obtieneEnteroOption(numero:String):Option[Int] = {
    try{
      Some(numero.trim.toInt)
    } catch {
      case e: Exception => None
    }
  }

  def obtieneEnteroEither(numero:String):Either[String, Int] = {
    try {
      Right(numero.trim.toInt)
    } catch {
      case e:Exception => Left(s"""Error en cadena "$numero"""")
    }
  }
}
