package com.jemb.gluefunctions.generales

object BindGlue {
  def f(a: Int): (Int, String) = {
    val res = a *  2
    val inf = s"\tf($a) => $res\n"
    (res, inf)
  }

  def g(a: Int): (Int, String) = {
    val res = a *  3
    val inf = s"\tg($a) => $res\n"
    (res, inf)
  }

  def h(a: Int): (Int, String) = {
    val res = a *  4
    val inf = s"\th($a) => $res\n"
    (res, inf)
  }

  def bind(fun:Int=>(Int, String), tup:(Int, String)):(Int, String) = {
    //Obtiene los valores previos
    val resPrev = tup._1
    val infoPrev = tup._2
    //Aplica la funcion proveída y obtiene los valores actuales
    val (resAct, infAct) = fun(resPrev)
    val infNueva = infAct + infoPrev
    // Devuelve el resultado actual más la nueva informacion
    (resAct, infNueva)
  }

  def resultados():Unit = {
    println("------- resultados -------")
    val fRes = f(100)
    val gRes = bind(g, fRes)
    val hRes = bind(h, gRes)

    println(s"Res: ${hRes._1} \nInformacion: \n${hRes._2}")
    println("--------------------------")
  }
}
