package com.jemb.modeling.modelos.perro

trait hocicoPerroServicios {
  this: AnimalColudo =>
  def ladrar(): Unit = println("Ladrando...")

  def comer(): Unit = println("Comiendo...")

  def morder(): Unit = println("Mordiendo...")
}
