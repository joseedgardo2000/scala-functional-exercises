package com.jemb

import com.jemb.golf_state.monadas.State

package object golf_state {
  case class GolfState(distance:Int)

  def swing(distance:Int):State[GolfState, Int] = State {
    (s:GolfState) =>
      val newDistance = s.distance + distance
      (GolfState(newDistance), newDistance)
  }
}
