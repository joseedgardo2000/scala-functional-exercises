package com.jemb.golf_state

import com.jemb.golf_state.monadas.State

object Principal {

  def usaGolfState():Unit = {
    val stateWithNewDistance:State[GolfState, Int] = for {
      _             <- swing(20)
      _             <- swing(15)
      totalDistance <- swing(0)
    } yield totalDistance
    println("------------- usaGolfState -------------")
    val beginningState = GolfState(0)
    val result:(GolfState, Int) = stateWithNewDistance.run(beginningState)
    println(s"GolfState:      ${result._1}")  //GolfState(35)
    println(s"Total Distance: ${result._2}")  //35
    println("----------------------------------------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp024_golf_state_monad_02 =============")
    usaGolfState()
    println("============= ========================= =============")
  }
}
