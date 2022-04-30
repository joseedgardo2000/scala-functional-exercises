package com.jemb.update_case_class

import com.jemb.update_case_class.tipos.{InfoTarjetas, Nombre, TarCredito, Usuario}

object CreaDatos {
  // ------------- Datos --------------------------
  val pedroNom = Nombre("Pedro", "Durán", "López")
  val pedroUsr = Usuario(
    id = 1,
    nombre = pedroNom,
    tel = "271-344-1232",
    email = "pedro@hotcorreo.com",
    infoTarjetas = InfoTarjetas(
      Seq(
        TarCredito(
          nombre = pedroNom,
          numero = "1111111111111111",
          mes = 3, anio = 2025, cvv = "234"),
        TarCredito(
          nombre = pedroNom,
          numero = "2222222222222222",
          mes = 2, anio = 2030, cvv = "234")
      )
    )
  )
  // ------------- ----- --------------------------
  def actuaTel(usr:Usuario,nvoTel:String):Usuario = {
    usr.copy(tel = nvoTel)
  }

  def actuaApellidos (nombreOri: Nombre)
      (nvoApePat:String = nombreOri.apePat, nvoApeMat:String = nombreOri.apeMat):Nombre = {
    nombreOri.copy(apePat = nvoApePat, apeMat = nvoApeMat)
  }

  def actuaApellidosUsr(usr:Usuario)
      (nvoApePat:String = usr.nombre.apePat, nvoApeMat:String = usr.nombre.apeMat):Usuario = {
    val nvoNombre = actuaApellidos(usr.nombre)(nvoApePat, nvoApeMat)
    usr.copy(nombre = nvoNombre)
  }

  def actuaApeTars(usr:Usuario)
      (nvoApePat:String = usr.nombre.apePat, nvoApeMat:String = usr.nombre.apePat):Usuario = {

    val tarjetasOri = usr.infoTarjetas.tarsCredito
    val tarjetasNvo = tarjetasOri.map(tar => tar.copy(nombre = actuaApellidos(tar.nombre)(nvoApePat, nvoApeMat)))
    val nvoInfoTarjetas = usr.infoTarjetas.copy(tarjetasNvo)

    usr.copy(infoTarjetas = nvoInfoTarjetas)
  }


}
