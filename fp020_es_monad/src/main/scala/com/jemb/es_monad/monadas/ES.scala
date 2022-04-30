package com.jemb.es_monad.monadas

class ES[A] private (codigo: => A){
  def ejecutar:A = codigo

  def flatMap[B](f: A => ES[B]):ES[B] = ES(f(ejecutar).ejecutar)

  def map[B](f: A => B):ES[B] = flatMap(a => ES(f(a)))

}

object ES {
  def apply[A](codigo:A):ES[A] = new ES(codigo)
}