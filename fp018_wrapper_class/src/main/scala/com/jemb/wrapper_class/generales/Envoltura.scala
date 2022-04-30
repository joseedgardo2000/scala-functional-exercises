package com.jemb.wrapper_class.generales

class Envoltura[A] private (valor:A) {
  def map[B](f:A => B):Envoltura[B] = {
    Envoltura(f(valor))
  }

  def flatMap[B](f:A=>Envoltura[B]):Envoltura[B] = {
    f(valor)
  }

  override def toString = s"Envoltura($valor)"
}

object Envoltura{
  def apply[A](valor:A):Envoltura[A] = {
    new Envoltura(valor)
  }
}