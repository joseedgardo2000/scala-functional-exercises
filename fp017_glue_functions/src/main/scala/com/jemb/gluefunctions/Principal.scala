package com.jemb.gluefunctions

import com.jemb.gluefunctions.generales.{BIND_GLUE, BindGlue, EnumGlue, MANUAL_GLUE, ManualGlue}

object Principal {
  def obtieneResultados(sel: EnumGlue):Unit = sel match {
    case MANUAL_GLUE => ManualGlue.resultados()
    case BIND_GLUE => BindGlue.resultados()
  }
  def main(args: Array[String]): Unit = {
    println("============= fp017_glue_functions =============")
    obtieneResultados(BIND_GLUE)
    println("============= ==================== =============")
  }
}
