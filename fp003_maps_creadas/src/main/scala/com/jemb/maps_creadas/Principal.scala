package com.jemb.maps_creadas

object Principal {

  def mapa01[A](lista:List[Int],funcion:Int=>A):List[A] = {
    for(elem <- lista) yield funcion(elem)
  }

  def creaMaps01():Unit = {
    val l1 = List(1,2,3,4)
    val f1 = (i:Int) => i * 2
    val f2 = (i:Int) => i / 2.0
    println("------------ creaMaps01() ------------")
    println(l1)
    println(mapa01(l1, f1))
    println(mapa01(l1, f2))
    println("------------ ------------ ------------")
  }

  def mapa02[A, B](lista:Iterable[A],funcion:A=>B):Iterable[B] = {
    for(elem <- lista) yield funcion(elem)
  }

  def creaMaps02():Unit = {
    val l01 = List("Juan", "Pepe", "Licha")
    val f01 = (e:String)=>s"Hola ${e}"
    val l02 = mapa02(l01,f01)

    val l03 = Iterable("Rosa", "Lauro", "Ticha")
    val f02 = (e:String)=>s"Adios ${e}"
    val l04 = mapa02(l03,f02)

    println("------------ creaMaps02() ------------")
    println(s"${l01.getClass} \n\t-> ${l01}")
    println(s"${l02.getClass} \n\t-> ${l02}")
    println(s"${l03.getClass} \n\t-> ${l03}")
    println(s"${l04.getClass} \n\t-> ${l04}")
    println("------------ ------------ ------------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp003_maps_creadas =============")
    //creaMaps01()
    creaMaps02()
    println("============= ================== =============")
  }
}
