package com.jemb.type_classes.v01.animal

object BehavesLikeHumanInstances {
  // Only for dogs
  implicit val dogBehavesLikeHuman:BehavesLikeHuman[Dog] = new BehavesLikeHuman[Dog] {
    def speak(a: Dog): Unit = {
      println(s"Mi nombre es: ${a.name} ¡Guau!")
    }
    def baila(a: Dog):Unit = {}
  }

  implicit val gatoHumanoide:BehavesLikeHuman[Cat] = new BehavesLikeHuman[Cat] {
    def speak(a: Cat): Unit = ???
    def baila(a: Cat):Unit = println(s"Mi nombre es: ${a.name} ¡Baila Tango!")
  }

}

object BehavesLikeHumanI {
  def speak[A](a: A)(implicit behavesLikeHumanInstance: BehavesLikeHuman[A]): Unit = {
    behavesLikeHumanInstance.speak(a)
  }
}

// Step 3b: add methods to dog class; use like `dog.speak`
object BehavesLikeHumanSyntax {
  implicit class BehavesLikeHumanOps[A](value: A) {
    def speak(implicit behavesLikeHumanInstance: BehavesLikeHuman[A]): Unit = {
      behavesLikeHumanInstance.speak(value)
    }

    def baila(implicit behavesLikeHumanInstance: BehavesLikeHuman[A]): Unit = {
      behavesLikeHumanInstance.baila(value)
    }

    def brinca:Unit = println("Brincar")
  }
}
