package com.jemb.state_monad.monadas
/*
Version propia de la clase State
 */
case class Estado(edo:Int) {
  def map(f:Int => Int):Estado = Estado(f(edo))
  def flatMap(f:Int => Estado):Estado = f(edo)
}
