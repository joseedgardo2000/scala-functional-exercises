package com.jemb.par_by_name

object Principal {

  def llamaPorNombre[A](codigo: =>A):A = {
    println("----- Entra [LlamaPorNombre] -----")
    val res = codigo
    println(s"Resultado: ${res}")
    println("----- Sale  [LlamaPorNombre] -----")
    res
  }

  def main(args: Array[String]): Unit = {
    println("============= fp004_param_by_name =============")
    llamaPorNombre(println("Hola"))
    llamaPorNombre{
      println("Suma 4 + 5")
      4 + 5
    }
    println("============= ======== =============")
  }
}
