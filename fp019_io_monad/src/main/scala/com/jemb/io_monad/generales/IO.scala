package com.jemb.io_monad.generales

class IO[A] private (codigo: => A) {

  def run:A = {println("run: "); codigo}

  def map[B](f: A => B):IO[B] = {
    flatMap(a=>IO(f(a)))
  }

  def flatMap[B](f: A => IO[B]):IO[B] = {
    val res01: IO[B] = IO(f(run).run)
    res01
  }
}

object IO {
  def apply[A](codigo: => A):IO[A] = new IO(codigo)
}
