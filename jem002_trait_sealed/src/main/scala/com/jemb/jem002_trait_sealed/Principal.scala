package com.jemb.jem002_trait_sealed

import com.jemb.jem002_trait_sealed.traits.{Chino, Español, Inglés}
import com.jemb.jem002_trait_sealed.traits.Traductor

object Principal {

  def func01():Unit = {
    println("--------------- func01 ---------------")
    val esp = Español("hola")
    val ing = Inglés("hola")
    val chi = Chino("hola")
    val ind = Inglés("pollo")

    println(esp)
    println(ing)
    println(chi)
    println(ind)
    println("--------------- ------ ---------------")
  }

  def func02():Unit = {
    def adios(trad:Traductor):String = trad match {
      case pal:Español => pal.adios()
      case pal:Inglés => pal.adios()
      case pal:Chino => pal.adios()
    }
    println("--------------- func02 ---------------")
    val esp = Español("x")
    val ing = Inglés("x")
    println(adios(esp))
    println(adios(ing))
    println(adios(Chino("x")))
    println("--------------- ------ ---------------")
  }


  def main(args: Array[String]): Unit = {
    println("============= jem002_trait_sealed =============")
    func01()
    func02()
    println("============= ======== =============")
  }
}
