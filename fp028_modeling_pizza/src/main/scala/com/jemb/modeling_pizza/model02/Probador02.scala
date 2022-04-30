package com.jemb.modeling_pizza.model02

import com.jemb.modeling_pizza.model02.database.MockPizzaDao
import com.jemb.modeling_pizza.model02.enums.{Cheese, CrustSize, CrustType, LargeCrustSize, MediumCrustSize, Olives, Pepperoni, ThickCrustType, ThinCrustType, Topping}
import com.jemb.modeling_pizza.model02.model.Pizza

object Probador02 {

  // initialize the data from database
  val toppingPrices: Map[Topping, Money] = MockPizzaDao.getToppingPrices()
  val crustSizePrices: Map[CrustSize, Money] = MockPizzaDao.getCrustSizePrices()
  val crustTypePrices: Map[CrustType, Money] = MockPizzaDao.getCrustTypePrices()
  println(s"Data: $toppingPrices @ $crustSizePrices @ $crustTypePrices")

  // create a pizza
  val pizza1:Pizza = Pizza(
    MediumCrustSize,
    ThinCrustType,
    Seq(Cheese, Pepperoni)
  )
  println(s"Pizza1: $pizza1")

  // make sure you can create modified versions of
  // the initial pizza
  val pizza2:Pizza = pizza1.addTopping(Olives)
  val pizza3:Pizza = pizza2.updateCrustSize(LargeCrustSize)
  println(s"pizza3: $pizza3")

  // getPrice looks like this
  val pizzaPrice:Money = pizza3.getPrice(
    toppingPrices,
    crustSizePrices,
    crustTypePrices
  )
  println(s"price of pizza3: $pizzaPrice")
  // can also do this
  val pizza4:Pizza = pizza1.addTopping(Olives)
    .updateCrustSize(LargeCrustSize)
    .updateCrustType(ThickCrustType)

  println(s"pizza4: $pizza4")

  def ejecutar():Unit = {
    println("-------- ejecutar Model02 --------")
    println("---->> Se prueba el modelado por OBJETOS FUNCIONALES")
    println("\nSe ha probado el modelado por OBJETOS FUNCIONALES <<----")
  }
}
