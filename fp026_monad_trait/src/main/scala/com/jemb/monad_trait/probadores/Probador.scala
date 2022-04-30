package com.jemb.monad_trait.probadores

import com.jemb.monad_trait.enums.PruEnum

trait Probador {

  def selPrueba(op:PruEnum):Unit
  def ejecutar():Unit

  def pendiente:Unit = println("Por implementar...")

  def pendiente(cod:Any):Unit = println(s"[$cod]: Por implementar...")

  override def toString: String =
    super.toString.split("\\$@")(0).split("\\.").last
}
