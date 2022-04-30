package com.jemb.jem002_trait_sealed.traits

/**
 * Cuando se utiliza "sealed trait"
 * todo debe ir en el mismo archivo
 */
sealed trait Traductor {
  val tpalabra:String = "indefinida"
  def hola():String = "indefinido"
  def adios():String = "indefinido"
  override def toString:String = tpalabra.toLowerCase() match {
    case "hola" => hola()
    case "adios" => adios()
    case _ => "indefinido"
  }
}

case class Español(palabra:String) extends Traductor {
  override val tpalabra: String = palabra
  override def hola():String = "hola"
  override def adios():String = "adios"
}

case class Inglés(palabra:String) extends  Traductor  {
  override val tpalabra = palabra
  override def hola():String = "hello"
  override def adios():String = "bye"
}

case class Chino(palabra:String) extends  Traductor  {
  override val tpalabra = palabra
  override def hola():String = "你好"
  override def adios():String = "再见"
}