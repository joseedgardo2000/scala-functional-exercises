package com.jemb.habilitar_for_exp.tipos

import scala.collection.mutable.ArrayBuffer

case class Secuencia[A](elems:A*){
  //private val elems = scala.collection.mutable.ArrayBuffer
  //elems ++= primElems

  private def aplanador[B](secAnidada: Secuencia[Secuencia[B]])
    :Secuencia[B] = {
    val xs = ArrayBuffer[B]()
    for(e <- secAnidada) e match {
      case e:Secuencia[B] => for(ee <- e) {xs += ee}
      case e:B => xs += e
    }

    Secuencia(xs.toSeq: _*)
  }
  override
  def toString: String = s"Secuencia(${elems.mkString(",")})"

  // habilita el generador del for
  def foreach(accion: A => Unit):Unit = {
    elems.foreach(accion)
  }

  // habilita el yield simple del for
  def map[B](transformador:A=>B):Secuencia[B] = {
    Secuencia(elems.map(transformador): _*)
  }

  // habilita el filtro del for
  def withFilter(filtro: A => Boolean):Secuencia[A] = {
    val p = elems.filter(filtro)
    Secuencia(p: _*)
  }
  //

  def flatten:Secuencia[A] = {
    val xs = ArrayBuffer[A]()
    for(e <- elems) e match {
      case e:Secuencia[A] => for(ee <- e.elems) {xs += ee}
      case e:A => xs += e
    }
    Secuencia[A](xs.toSeq: _*)
  }

  // habilita multiples generadores en for-yield

  def flatMap[B](transformador: A => Secuencia[B]):Secuencia[B] = {

    val mapeo = map(transformador)
    println(s"mapeo: $mapeo")
    val plano = aplanador(mapeo)
    plano
  }

}