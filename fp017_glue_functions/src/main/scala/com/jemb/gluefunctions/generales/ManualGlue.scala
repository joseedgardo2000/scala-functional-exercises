package com.jemb.gluefunctions.generales

object ManualGlue {
  private def f(a:Int):(Int, String) = {
    val res = a * 2
    (res, s"a * 2: $a * 2: $res")
  }

  private def g(a:Int):(Int, String) = {
    val res = a * 3
    (res, s"a * 3: $a * 3: $res")
  }

  def resultados():Unit = {
    println("------- resultados -------")
    val iniVal = 100
    val (fRes, fInf) = f(iniVal)
    val (gRes, gInf) = g(fRes)
    val uInf = fInf + " -> " + gInf
    println(s"Res: $gRes \n\tInf: $uInf")
    println("------- ---------- -------")
  }

}
