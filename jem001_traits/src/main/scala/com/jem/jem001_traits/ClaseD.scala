package com.jem.jem001_traits

class ClaseD extends TraitC {
  override def identificacion(): String = {
    "ClaseD" + " -> " + super.identificacion()
  }
}
