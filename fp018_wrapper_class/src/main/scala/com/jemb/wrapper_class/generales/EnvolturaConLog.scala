package com.jemb.wrapper_class.generales

case class EnvolturaConLog [A](valor:A, log:String){
  def map[B](f: A => B):EnvolturaConLog[B] = {
    val nvoValor = f(valor)
    EnvolturaConLog(nvoValor, s"[M] $log")
  }
  def flatMap[B](f: A => EnvolturaConLog[B]):EnvolturaConLog[B] = {
    val nvoRes = f(valor)
    val nvoLog = s"[F] $log -> ${nvoRes.log}"
    EnvolturaConLog(nvoRes.valor, nvoLog)
  }
}
