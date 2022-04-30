package com.jemb.jem003_trait_enum

import com.jemb.jem003_trait_enum.enums.{
  DOMINGO, JUEVES, LUNES, MARTES, MIERCOLES,
  SABADO, Semana, VIERNES
}

object Principal {
  def checaDia(dia:Semana):String = dia match {
    case LUNES => "Lunes"
    case MARTES => "Martes"
    case MIERCOLES => "Miércoles"
    case JUEVES => "Jueves"
    case VIERNES => "Viernes"
    case SABADO => "Sábado"
    case DOMINGO => "Domingo"
  }
  def main(args: Array[String]): Unit = {
    println("============= jem003_trait_enum =============")
    println(checaDia(VIERNES))
    println(checaDia(SABADO))
    println(LUNES)
    println("============= ======== =============")
  }
}
