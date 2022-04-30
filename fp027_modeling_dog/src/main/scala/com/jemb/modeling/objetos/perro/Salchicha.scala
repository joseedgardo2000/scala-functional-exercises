package com.jemb.modeling.objetos.perro

import com.jemb.modeling.modelos.perro.{AnimalColudo, colaPerroServicios, hocicoPerroServicios}

import java.awt.Color

object Salchicha extends AnimalColudo(Color.black)
  with colaPerroServicios with hocicoPerroServicios {

}
