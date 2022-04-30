package com.jemb.state_monad.monadas
/*
  Version Original del libro
 */
case class State(value:Int){
  def map(f:Int => Int):State = {
    State(f(value))
  }
  def flatMap(f:Int => State): State = {
    val newState = f(value)
    State(newState.value)
  }
}

