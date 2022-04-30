package com.jemb.io_state.monadas

class IO[A] private (constructorCodeBlock: => A) {

  def run:A = constructorCodeBlock

  //def flatMap[B](f: A => IO[B]): IO[B] = IO(f(run).run)

  def flatMap[B](customFmapAlgorithm: A => IO[B]): IO[B] = {
    /*

    // Este código comentado
    // No espera que se aplique run para ejecutar el "for", por lo tanto
    // aunque esta forma parece equivalente, no lo es.
    // Se entonces utiliza la
    // forma de emplear solo una sola instrucción: IO(f(run).run)

    val res1: IO[B] = customFmapAlgorithm(run)
    val res2: B = res1.run
    IO(res2)

    */

    IO(customFmapAlgorithm(run).run)
  }

  def map[B](f: A => B): IO[B] = flatMap(a => IO(f(a)))

}

object IO {
  def apply[A](a: => A): IO[A] = new IO(a)
}
