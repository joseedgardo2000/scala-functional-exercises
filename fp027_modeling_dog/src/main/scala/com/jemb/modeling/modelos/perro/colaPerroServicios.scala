package com.jemb.modeling.modelos.perro

trait colaPerroServicios {
  // Implementers must be a subtype of AnimalColudo
  this: AnimalColudo =>
  def moverCola(): Unit = println("Moviendo Cola...")

  def bajarCola(): Unit = println("Bajando Cola...")

  def subirCola(): Unit = println("Subiendo Cola...")
}
