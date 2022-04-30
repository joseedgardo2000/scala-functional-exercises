package com.jemb.update_case_class

object Principal {
  def main(args: Array[String]): Unit = {
    val persona = CreaDatos.pedroNom
    val usuario = CreaDatos.pedroUsr
    val usrNvoTel = CreaDatos.actuaTel(usuario,"271-634-1322")
    val usrNvoApe = CreaDatos.actuaApellidosUsr(usrNvoTel)(nvoApeMat = "Gómez")
    val usrNvoApeTars = CreaDatos.actuaApeTars(usrNvoApe)(nvoApeMat = "Gómez")

    println("============= fp012_updateCaseClass_01 =============")
    println(s"Persona Original: $persona")
    println(s"Usuario Original: $usuario")
    println(Console.BLUE)
    println(s"Usuario Nvo Tel:  $usrNvoTel")
    println(s"Usuario Nvo Ape:  $usrNvoApe")
    println(s"Usuario Nvo Tar:  $usrNvoApeTars")
    println(Console.RESET)
    println("============= ======================== =============")
  }
}
