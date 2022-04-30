package com.jemb.wrapper_class.generales

object ProbadorEnvolturaTrazaInt {

  def f(a:Int):EnvolturaTrazaInt = {
    val res = a * 2
    val log = s"f($a) = $a * 2 = $res"
    EnvolturaTrazaInt(res, log)
  }

  def g(a:Int):EnvolturaTrazaInt = {
    val res = a * 3
    val log = s"g($a) = $a * 3 = $res"
    EnvolturaTrazaInt(res, log)
  }

  def h(a:Int):EnvolturaTrazaInt = {
    val res = a * 4
    val log = s"h($a) = $a * 4 = $res"
    EnvolturaTrazaInt(res, log)
  }
}
