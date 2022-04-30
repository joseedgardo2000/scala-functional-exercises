package com.jemb.golf_state

import com.jemb.golf_state.monadas.State

object Principal {
  def pru01():Unit = {
    val stateWithNewDistance: State[GolfState, Int] = for {
      _             <- swing(20)
      _             <- swing(15)
      totalDistance <- swing(0)
    } yield totalDistance * 2

    // THE ACTION BEGINS

    val beginningState = GolfState(0)

    // `run` is like `unsafeRunSync` in the Cats `IO` monad
    val result: (GolfState, Int) = stateWithNewDistance.genTuplaEdo(beginningState)
    println(s"GolfState:      ${result._1}")  //GolfState(35)
    println(s"Total Distance: ${result._2}")  //35
    println(s"Result: $result")
  }

  def pru02():Unit = {
    val edoConNvaDist: State[GolfState, Int] =
      swing(20)
       // .flatMap((_:Int) =>
       //   swing(15)
       //     .flatMap((_:Int) =>
       //       swing(10)
                .map((totalDistance: Int) =>
                  totalDistance * 2)
        //))

    println(edoConNvaDist)
    val edoInicial:GolfState = GolfState(0)
    val result: (GolfState, Int) = edoConNvaDist.genTuplaEdo(edoInicial)
    println(result)

  }

  def main(args: Array[String]): Unit = {
    println("============= fp023_golf_state_monad =============")
    //pru01()
    pru02()
    println("============= ====================== =============")
  }
}
