package com.jemb

import com.jemb.io_state.monadas.{IO, State}

package object io_state {
  // Código de Entrada Salida
  def getLine(): IO[String] = IO(scala.io.StdIn.readLine())
  def putStrLn(s: String): IO[Unit] = IO(println(s))

  // Código de estado
  type Stack = List[String]
  def push(x:String):State[Stack, Unit] = State[Stack, Unit] {
    xs =>
      (x::xs,())
  }
}
