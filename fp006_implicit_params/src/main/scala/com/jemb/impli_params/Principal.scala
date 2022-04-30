package com.jemb.impli_params

object Principal {
  def saludo(nombre:String)(implicit noche:Boolean):Unit = {
    if(noche)
      println(s"Buenas noches $nombre")
    else
      println(s"Buenos día $nombre")
  }
  def main(args: Array[String]): Unit = {
    println("============= fp006_implicit_params =============")
    implicit var b01:Boolean = true
    saludo("Juan")
    b01 = false
    saludo("Pancho")
    println("============= ======== =============")
  }
}
