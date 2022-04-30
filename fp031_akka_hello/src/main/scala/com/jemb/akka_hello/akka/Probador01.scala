package com.jemb.akka_hello.akka

import akka.actor.{ActorSystem, Props}
import com.jemb.akka_hello.akka.actores.HelloActor
import com.jemb.akka_hello.akka.mensajes.Hello

object Probador01 {
  // an actor needs an ActorSystem
  val sistema = ActorSystem("SistemaHola")

  // create and start the actor
  val actorHola = sistema.actorOf(Props[HelloActor], name = "actorHola")

  def enviaMensajes():Unit = {
    actorHola ! Hello("Hola")
    actorHola ! Hello("你好")
    // send it an unknown message
    actorHola ! "hi!"
  }


}
