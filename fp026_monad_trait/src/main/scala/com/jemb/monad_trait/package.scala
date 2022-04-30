package com.jemb

import com.jemb.monad_trait.monadas.IO

package object monad_trait {
  def getLine(): IO[String] = IO(scala.io.StdIn.readLine())
  def putStr(s: String): IO[Unit] = IO(print(s))
}
