package com.jemb.wrapper_class.generales

case class EnvolturaConLogB[A](valor:A, log:List[String]){
  def map[B](f: A=>B):EnvolturaConLogB[B] = {
    val nvoValor = f(valor)
    val logU = log.updated(log.length-1,"[M] " + log.last)
    EnvolturaConLogB(nvoValor, logU)
  }

  def flatMap[B](f:A=>EnvolturaConLogB[B]):EnvolturaConLogB[B] = {
    val nvoValor = f(valor)
    val logU = log.updated(log.length-1,"[F] " + log.last)
    val nvoLog = logU:::nvoValor.log
    EnvolturaConLogB(nvoValor.valor, nvoLog)
  }
}
