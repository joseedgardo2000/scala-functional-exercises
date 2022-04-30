package com.jemb.type_classes.v01.animal

object Probador01 {
  def ejecutar():Unit = {

    println("---------- Ejecutar Probador01 ----------")
    import BehavesLikeHumanInstances.dogBehavesLikeHuman
    import BehavesLikeHumanInstances.gatoHumanoide
    val Robert = Dog("Robert")
    val Felix = Cat("Felix")
    BehavesLikeHumanI.speak(Robert)
    // BehavesLikeHumanI.speak(Felix)
    println(Robert)
    println(Felix)
    println("----------------------------------------")
    import BehavesLikeHumanSyntax.BehavesLikeHumanOps
    Robert.speak
    Robert.baila
    //Felix.speak
    Felix.baila
    Felix.brinca
  }
}
