package com.jemb

package object golf_estado {
  //------------------------------------
  // Cambio de Estado: Sin historia
  //------------------------------------
  case class GolfState01(distance: Int)

  def nextStroke01(prevState:GolfState01, distNextHit:Int):GolfState01 = {
    GolfState01(prevState.distance + distNextHit)
  }
  //------------------------------------
  // Cambio de Estado: Con historia
  //------------------------------------
  case class GolfState02(strokes:List[Int])

  def nextStroke02(gs:GolfState02, distNextHit:Int):GolfState02 = {
    GolfState02(distNextHit::gs.strokes)
  }
  //------------------------------------
  // Cambio de Estado: Con historia y Pila
  //------------------------------------
  def push[A](xs:List[A], x:A):List[A] = x::xs
  def pop[A](xs:List[A]):(A, List[A]) = (xs.head, xs.tail)
}
