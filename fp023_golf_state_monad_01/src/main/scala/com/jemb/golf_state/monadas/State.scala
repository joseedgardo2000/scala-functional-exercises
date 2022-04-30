package com.jemb.golf_state.monadas
/*
  S => Tipo del Estado
  A => Tipo de la Delta
 */
case class State[S,A](genTuplaEdo:S=>(S, A)) {
  def flatMap[B](funFM:A=>State[S, B]):State[S, B] = State {
    (edoAnt:S) =>
      val (edoNvo, deltaNvo) = genTuplaEdo(edoAnt)
      val res = funFM(deltaNvo).genTuplaEdo(edoNvo)
      res
  }

  def map[B](funMap:A=>B):State[S, B] = {
    flatMap(a =>
      State.point(funMap(a)))
  }
}

object State {
  def point[S, A](v: A): State[S, A] = State(
    genTuplaEdo = s => (s,v)
  )
}
