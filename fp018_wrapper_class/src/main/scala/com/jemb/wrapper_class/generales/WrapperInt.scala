package com.jemb.wrapper_class.generales

class WrapperInt(value:Int) {
  def map(f: Int => Int):WrapperInt = {
    // apply `f` to an `Int` to get a new `Int`
    val newVal = f(value)
    // wrap the new `Int` in a `Wrapper`
    WrapperInt(newVal)
  }

  def flatMap(f: Int => WrapperInt):WrapperInt = f(value)

  override def toString: String = s"WrapperInt($value)"

}

object WrapperInt {
  def apply(value:Int):WrapperInt = new WrapperInt(value)
}
