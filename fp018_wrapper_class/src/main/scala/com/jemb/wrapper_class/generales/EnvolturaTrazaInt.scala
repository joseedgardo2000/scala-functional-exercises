package com.jemb.wrapper_class.generales

case class EnvolturaTrazaInt(num:Int, log:String) {
  def map(f: Int => Int):EnvolturaTrazaInt = {
    EnvolturaTrazaInt(f(num), s"[M]  $log")
  }
  def flatMap(f: Int => EnvolturaTrazaInt):EnvolturaTrazaInt = {
    val nvoVal = f(num)
    EnvolturaTrazaInt(nvoVal.num, s"[FM] $log -> {${nvoVal.log}}")
  }
}
