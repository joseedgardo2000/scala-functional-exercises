package com.jemb.monad_trait.probadores
import com.jemb.monad_trait.enums.{PRU01, PruEnum}

object Probador05 extends Probador {
  override def selPrueba(op: PruEnum): Unit = op match {
    case PRU01 => pendiente(op)
  }

  override def ejecutar(): Unit = {
    println(s"--------------- ejecutar [$this] ---------------")
    selPrueba(PRU01)
  }
}
