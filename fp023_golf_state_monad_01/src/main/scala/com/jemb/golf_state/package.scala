package com.jemb

import com.jemb.golf_state.monadas.State

package object golf_state {
  case class GolfState(distance:Int)

  def swing(deltaDist: Int): State[GolfState, Int] = State {
    (edoAnt:GolfState) =>
      val newDistance = edoAnt.distance + deltaDist
      val edoNvo = GolfState(newDistance)
      val tuplaNvoEdo = (edoNvo, newDistance)
      tuplaNvoEdo
  }
}
