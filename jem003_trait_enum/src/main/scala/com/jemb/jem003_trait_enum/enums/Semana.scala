package com.jemb.jem003_trait_enum.enums

sealed trait Semana extends Enumeration

case object LUNES extends Semana
case object MARTES extends Semana
case object MIERCOLES extends Semana
case object JUEVES extends Semana
case object VIERNES extends Semana
case object SABADO extends Semana
case object DOMINGO extends Semana

