package com.jemb.wrapper_class

import com.jemb.wrapper_class.generales.{Envoltura, ProbadorEnvolturaConLogB, ProbadorEnvolturaConLogGral, ProbadorEnvolturaTrazaInt, WrapperInt}

object Principal {

  def pruWrapperInt():Unit = {
    val res:WrapperInt = for {
      a <- WrapperInt(5)
      b <- WrapperInt(3)
      c <- WrapperInt(2)
    } yield a + b + c
    println(s"Res: $res")
  }

  def pruEnvoltura01():Unit = {
    val res:Envoltura[Int] = for {
      a <- Envoltura(5)
      b <- Envoltura(3)
      c <- Envoltura(2)
    } yield a + b + c
    println(s"Res: $res")
  }

  def pruEnvoltura02():Unit = {
    val res = for {
      a <- Envoltura("a")
      b <- Envoltura("b")
      c <- Envoltura("c")
    }  yield s"--> $a - $b - $c <--"
    println(s"Res: $res")
  }

  def pruEnvolturaTrazaInt():Unit = {
    val res = for {
      a <- ProbadorEnvolturaTrazaInt.f(100)
      b <- ProbadorEnvolturaTrazaInt.g(a)
      c <- ProbadorEnvolturaTrazaInt.h(b)
    } yield c
    println(s"Res: ${res.num}")
    println(s"Res: ${res.log}")
  }

  def pruEnvolturaConLog01():Unit = {
    val res = for {
      a <- ProbadorEnvolturaConLogGral.f(100) // original
      b <- ProbadorEnvolturaConLogGral.g(a)   // flatMap
      c <- ProbadorEnvolturaConLogGral.h(b)   // flatMap
    } yield c                                 // Map
    println(s"Res: ${res.valor}")
    println(s"Log:\n${res.log}")
  }

  def pruEnvolturaConLog02():Unit = {
    val res = for {
      a <- ProbadorEnvolturaConLogGral.invierteCaso('a') // original
      b <- ProbadorEnvolturaConLogGral.invierteCaso(a) // flatMap
      c <- ProbadorEnvolturaConLogGral.invierteCaso(b)   // flatMap
    } yield c                                 // Map
    println(s"Res: ${res.valor}")
    println(s"Log:\n${res.log}")
  }

  def pruEnvolturaConLogB01():Unit = {
    val letra = 'd'
    val res = for {
      t1 <- ProbadorEnvolturaConLogB.invierteCaso(letra)
      t2 <- ProbadorEnvolturaConLogB.invierteCaso(t1)
      t3 <- ProbadorEnvolturaConLogB.invierteCaso(t2)
    } yield t3
    println(s"Res: ${res.valor}")
    println("Log")
    res.log.foreach(println)
  }

  def pruEnvolturaConLogB02():Unit = {
    val res = for {
      a <- ProbadorEnvolturaConLogB.f(100)
      b <- ProbadorEnvolturaConLogB.g(a)
      c <- ProbadorEnvolturaConLogB.h(b)
    } yield c
    println(s"Res: ${res.valor}")
    println("Log")
    res.log.foreach(println)
  }

  def main(args: Array[String]): Unit = {
    println("============= fp018_wrapper_class =============")
    /*
    pruWrapperInt()
    pruEnvoltura01()
    pruEnvoltura02()
    pruEnvolturaTrazaInt()
    pruEnvolturaConLog01()
    pruEnvolturaConLog02()
    pruEnvolturaConLogB01()
    */
    pruEnvolturaConLogB02()

    println("============= =================== =============")
  }
}
