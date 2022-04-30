package com.jemb.wrapper_class.generales

object ProbadorEnvolturaConLogB {
  def invierteCaso(letra:Char):EnvolturaConLogB[Char] = {
    val res = if (letra.isLower) letra.toUpper else letra.toLower
    val log = s"invierteCaso: $letra => $res"
    EnvolturaConLogB(res, List(log))
  }

  def f(a:Int):EnvolturaConLogB[Int] = {
    val res = a * 2
    val log = s"f: $a * 2 = $res"
    EnvolturaConLogB(res, List(log))
  }

  def g(a:Int):EnvolturaConLogB[Int] = {
    val res = a * 3
    val log = s"g: $a * 3 = $res"
    EnvolturaConLogB(res, List(log))
  }

  def h(a:Int):EnvolturaConLogB[Int] = {
    val res = a * 4
    val log = s"h: $a * 4 = $res"
    EnvolturaConLogB(res, List(log))
  }
}
