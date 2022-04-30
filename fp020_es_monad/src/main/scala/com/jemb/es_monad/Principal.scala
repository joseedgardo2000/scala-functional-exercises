package com.jemb.es_monad

import com.jemb.es_monad.generales.{EjecutorCiclico, ProbadorES}

object Principal {
  def main(args: Array[String]): Unit = {
    println("============= fp020_es_monad =============")
    //ProbadorES.ejecutor()
    EjecutorCiclico.ejecutor()
    println("============= ============== =============")
  }
}
