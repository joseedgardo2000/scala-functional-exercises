package com.jemb.io_state.traits

import com.jemb.io_state.enums.PruEnum

trait Probador {

  def selPrueba(op:PruEnum):Unit = ???
  def ejecutar():Unit = ???

  override def toString: String =
    super.toString.split("\\$@")(0).split("\\.").last
}
