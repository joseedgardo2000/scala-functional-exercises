package com.jemb.akka_hello.akka.actores

import akka.actor.Actor
import com.jemb.akka_hello.akka.mensajes.Hello

class HelloActor extends Actor{
  def receive:PartialFunction[Any, Unit] = {
    case Hello(s) =>
      println(s"Has dicho: '$s'")
      println(s"'$s' para ti tambien")
    case x => println(s"'$x':¡No entendí!")
  }
}
