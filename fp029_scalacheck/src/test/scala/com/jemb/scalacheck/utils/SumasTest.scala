package com.jemb.scalacheck.utils

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

class SumasTest extends Properties("Sumas") {
  property("Sumar") = forAll { input: (Int, Int) =>
    //println(s"input = $input")
    //val result = MathUtils.increaseRandomly(input)

    val (a,b) = input
    val result = Sumas.suma(a,b)
    result == a + b
  }
}
