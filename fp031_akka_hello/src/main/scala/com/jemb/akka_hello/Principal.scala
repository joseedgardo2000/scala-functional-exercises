package com.jemb.akka_hello

import com.jemb.akka_hello.akka.Probador01

object Principal {
  def main(args: Array[String]): Unit = {
    println("============= fp031_akka_hello =============")
    Probador01.enviaMensajes()
    Probador01.sistema.terminate()
    println("============= ================ =============")
  }
}
