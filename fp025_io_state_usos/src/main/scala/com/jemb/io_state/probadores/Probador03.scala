package com.jemb.io_state.probadores

import com.jemb.io_state.enums.{PRU_IO_FOR_SIMPLE, PRU_ST_FOR, PruEnum}
import com.jemb.io_state.{getLine, push, putStrLn}
import com.jemb.io_state.traits.Probador

object Probador03 extends Probador {

  /**
   * pruIoForSimple: prompt a user for some input, then push that input
   * onto a stack. you'll get errors when you try to run this
   * code, so it's commented-out.
   */
  def pruIoForSimple():Unit = {
    println("------------ pruIoForSimple ------------")
    println("El código no se puede ejecutar, generaría error")
    /*
    val res = for {
                _     <- putStrLn("Type anything:")
                input <- getLine
                _     <- push(input)
                _     <- putStrLn(s"Input: $input")
              } yield ()
     */
  }

  override def selPrueba(op: PruEnum): Unit = op match {
    case PRU_IO_FOR_SIMPLE => pruIoForSimple()
  }

  override def ejecutar(): Unit = {
    println(s"--------- ejecutar [$this] ---------")
    selPrueba(PRU_IO_FOR_SIMPLE)
  }
}
