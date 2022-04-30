package com.jem.jem001_traits

trait TraitC extends TraitB01 with TraitB02 {
  override def identificacion():String = {
    "TraitC" + " -> " + super.identificacion()
  }
}
