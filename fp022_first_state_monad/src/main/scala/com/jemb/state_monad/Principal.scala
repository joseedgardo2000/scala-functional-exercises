package com.jemb.state_monad

import com.jemb.state_monad.monadas.{Estado, State}

object Principal {

  def pruEstado01():Unit = {
    println("-------------- pruEstado01 --------------")
    val res = for {
      e01 <- State(20)
      e02 <- State(e01 + 15)
      e03 <- State(e02 + 0)
    } yield (e03)
    println(res)
    println("-------------- ----------- --------------")
  }

  def pruEstado02():Unit = {
    println("-------------- pruEstado02 --------------")
    val res = for {
      e01 <- Estado(20)
      e02 <- Estado(e01 + 15)
      e03 <- Estado(e02 + 0)
    } yield (e03)
    println(res)
    println("-------------- ----------- --------------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp022_first_state_monad =============")
    pruEstado01()
    pruEstado02()
    println("============= ======================= =============")
  }
}
