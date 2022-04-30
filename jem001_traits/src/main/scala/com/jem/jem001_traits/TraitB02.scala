package com.jem.jem001_traits

trait TraitB02 extends TraitA {
  override def identificacion():String = {
    "TraitB02" + " -> " + super.identificacion()
  }
}
