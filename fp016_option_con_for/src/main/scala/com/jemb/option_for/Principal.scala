package com.jemb.option_for

import com.jemb.option_for.general.{EITHER, OPTION, TRY, UsoEnum}
import com.jemb.option_for.uso.{UsaEither, UsaOption, UsaTry}

object Principal {

  def selectUsos(uso:UsoEnum):Unit = uso match {
    case OPTION => UsaOption.lanzaUsos()
    case TRY => UsaTry.lanzaUsos()
    case EITHER => UsaEither.lanzaUsos()
  }

  def main(args: Array[String]): Unit = {
    println("============= fp016_option_con_for =============")
    selectUsos(EITHER)
    println("============= ==================== =============")
  }
}
