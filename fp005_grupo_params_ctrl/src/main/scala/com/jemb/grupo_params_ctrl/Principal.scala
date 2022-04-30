package com.jemb.grupo_params_ctrl

object Principal {
  def mientras(condicion: =>Boolean)(accion: =>Unit):Unit = {
    while(condicion) accion
  }

  def si[A](condicion: =>Boolean)
        (siVerdad: =>A)(siFalso: =>A):A = {
    if(condicion) siVerdad else siFalso
  }

  def main(args: Array[String]): Unit = {
    println("============= fp005_grupo_params_ctrl =============")
    var i = 0

    mientras(i < 5){
      println(s"Pasada: $i")
      i+=1
    }

    var edad = 40
    var etapa = si(edad>18) {"adulto"} {"menor"}
    println(s"Etapa: $etapa")

    edad = 15
    etapa = si(edad>18) {"adulto"} {"menor"}
    println(s"Etapa: $etapa")

    println("============= ======== =============")
  }
}
