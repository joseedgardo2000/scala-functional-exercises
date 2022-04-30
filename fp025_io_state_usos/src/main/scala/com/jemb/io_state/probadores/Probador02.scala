package com.jemb.io_state.probadores

import com.jemb.io_state.enums.{PRU_IO_FOR, PRU_ST_FOR, PruEnum}
import com.jemb.io_state.monadas.IO
import com.jemb.io_state.monadas.State
import com.jemb.io_state.{getLine, putStrLn}
import com.jemb.io_state.traits.Probador

/*
Este probador se encarga de demostrar el uso de las monadas de
IO y State dentro de una expresión "for" tal y como son.

Esto debe desembocar en un error
*/
object Probador02 extends Probador {

  case class GolfState(distance: Int)

  def swing(distance: Int): State[GolfState, Int] = State { (s: GolfState) =>
    val newDistance = s.distance + distance
    (GolfState(newDistance), newDistance)
  }

  //case class

  def edoCadena(deltaCad: String): State[List[String], String] = State {
    (hist :List[String]) =>
      val nvaCad:String = s"${hist.mkString(",")}, $deltaCad"
      val nvaHist:List[String] = hist.appended(deltaCad)
      (nvaHist, nvaCad)
  }

  def pruIOFor():Unit = {
    println("----------- pruIOFor -----------")
    val res:IO[Unit] = for {
      _   <- putStrLn("Introduce una palabra: ")
      pal <- getLine()
      _   <- putStrLn("Res: " + pal)
    } yield ()
    res.run
  }

  def pruSTFor01():Unit = {
    println("----------- pruSTFor01 -----------")
    val edoConNvaDist:State[GolfState, Int] = for {
      _             <- swing(20)
      _             <- swing(15)
      totalDistance <- swing(0)
    } yield {println("td"); totalDistance}

    val beginningState = GolfState(0)
    val res = edoConNvaDist.run(beginningState)
    println(s"Res: $res")
  }

  def pruSTFor02():Unit = {
    println("----------- pruSTFor02 -----------")
    val genNvoEdo:State[List[String], String] = for {
      _ <-      edoCadena("a")
      _ <-      edoCadena("b")
      _ <-      edoCadena("c")
      edofin <- edoCadena("d")
    } yield edofin
    val edoInicial = List().empty
    val res = genNvoEdo.run(edoInicial)
    println(s"Res: $res")
    println(s"Historia: ${res._1}")
    println(s"EdoFinal: ${res._2}")
  }

  override def selPrueba(op: PruEnum): Unit = op match {
    case PRU_IO_FOR => pruIOFor()
    case PRU_ST_FOR => pruSTFor01()
                       pruSTFor02()
  }

  override def ejecutar(): Unit = {
    println(s"--------- ejecutar [$this] ---------")

    selPrueba(PRU_ST_FOR)
  }
}
