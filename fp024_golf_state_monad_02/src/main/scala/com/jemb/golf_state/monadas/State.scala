package com.jemb.golf_state.monadas

/*
   S: Tipo para el estado
   A: Tipo genérico
   B: Tipo genérico
 */
case class State[S, A](run: S =>(S, A)) {
  def flatMap[B](g: A => State[S, B]):State[S, B] = State {
    s0:S =>
      val (s01, a) = run(s0)
      g(a).run(s01)
  }

  def map[B](f: A => B):State[S, B] = flatMap(a => State.point(f(a)))
}

object State {
  def point[S, A](v: A): State[S, A] = State(run = s => (s, v))
}
