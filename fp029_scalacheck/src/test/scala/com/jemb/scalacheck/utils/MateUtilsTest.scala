package com.jemb.scalacheck.utils

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

class MateUtilsTest extends Properties("hola") {
  property("increaseRandomly") = forAll { input: Int =>
    val mateUtils = new MateUtils
    val result = mateUtils.increaseRandomly(input)
    result > input
  }
}
