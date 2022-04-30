package com.jemb.update_case_class.tipos

case class Nombre(nombres:String, apePat:String, apeMat:String)

case class InfoTarjetas(tarsCredito: Seq[TarCredito])

case class Usuario(
  id: Int,
  nombre: Nombre,
  infoTarjetas: InfoTarjetas,
  tel: String,
  email: String
)

case class TarCredito(
  nombre: Nombre,
  numero: String,
  mes: Int,
  anio: Int,
  cvv: String
)
