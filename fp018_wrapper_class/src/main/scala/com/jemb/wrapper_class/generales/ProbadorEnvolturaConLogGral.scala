package com.jemb.wrapper_class.generales

object ProbadorEnvolturaConLogGral {
  def f(a:Int): EnvolturaConLog[Int] = {
    val res = a * 2
    val log = s"f: $a * 2 = $res"
    EnvolturaConLog(res, log)
  }

  def g(a:Int): EnvolturaConLog[Int] = {
    val res = a * 3
    val log = s"g: $a * 3 = $res"
    EnvolturaConLog(res, log)
  }

  def h(a:Int): EnvolturaConLog[Int] = {
    val res = a * 4
    val log = s"h: $a * 4 = $res"
    EnvolturaConLog(res, log)
  }
  //-----------------------------------------
  def invierteCaso(a:Char): EnvolturaConLog[Char] = {
    val res = if (a.isLower) a.toUpper else a.toLower
    val log = s"invierteCaso: $a => $res"
    EnvolturaConLog(res, log)
  }

}
