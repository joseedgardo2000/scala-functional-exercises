package com.jemb.es_monad.generales

import com.jemb.es_monad.generales.Utilerias.{imprimeTxt, leeEntrada}
import com.jemb.es_monad.monadas.ES

object EjecutorCiclico {
  private def ciclo:ES[Unit] = for {
    _   <- imprimeTxt("Escribe algo: ")
    pal <- leeEntrada()
    _   <- imprimeTxt("Tu palabra fue: " + pal)
    _   <- if(pal == ":salir") ES() else ciclo
  } yield ()

  def ejecutor():Unit = {
    ciclo
  }
}
