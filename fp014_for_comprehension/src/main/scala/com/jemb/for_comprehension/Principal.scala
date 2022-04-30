package com.jemb.for_comprehension

import com.jemb.for_comprehension.generales.CaseClasses.Persona

object Principal {
  val P:Persona.type = Persona  //Una forma de alias a la case class
  val personas =
    List(P("Ramón", 41, 'M'), P("Luisa", 25, 'F'), P("Pedro", 30, 'M'))

  def forComprehension01():Unit = {
    println("------------ forComprehension01 ------------")
    val hombres = for {
      p <- personas     // generador
      g = p.genero      // definición
      if g == 'M'       // filtro
    } yield p.nombre

    println(s"Hombres: $hombres")
    println("------------ ------------------ ------------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp014_for_comprehension =============")
    println(s"Datos: $personas")
    forComprehension01()
    println("============= ======================= =============")
  }
}
