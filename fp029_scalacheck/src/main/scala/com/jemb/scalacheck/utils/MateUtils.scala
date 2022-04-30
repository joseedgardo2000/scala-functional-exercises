package com.jemb.scalacheck.utils

class MateUtils {
  /**
   * return a value that is increased over the input parameter
   * by a random value
   */
  def increaseRandomly(i: Int):Long = {
    val randomNum = getRandomIntFrom1To100
    //val randomNum = scala.util.Random.nextInt(100) + 1
    i + randomNum.toLong
  }

  private def getRandomIntFrom1To100: Int = scala.util.Random.nextInt(100) + 1
}
