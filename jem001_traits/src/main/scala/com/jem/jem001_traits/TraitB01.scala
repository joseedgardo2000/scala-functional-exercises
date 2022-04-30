package com.jem.jem001_traits

trait TraitB01 extends TraitA {
  override def identificacion():String = {
    "TraitB01" + " -> " + super.identificacion()
  }
}
