package com.jemb.modeling_pizza.model01.services

import com.jemb.modeling_pizza.Money
import com.jemb.modeling_pizza.model01.model.{CrustSize, CrustType, Pizza, Topping}
import com.jemb.modeling_pizza.model01.utils.ListUtils

trait PizzaService extends PizzaServiceInterface {
  def addTopping(p: Pizza, t: Topping): Pizza = {
    val newToppings = p.toppings :+ t
    p.copy(toppings = newToppings)
  }

  def removeTopping(p: Pizza, t: Topping): Pizza = {
    val newToppings = ListUtils.dropFirstMatch(p.toppings, t)
    p.copy(toppings = newToppings)
  }

  def removeAllToppings(p: Pizza): Pizza = {
    val newToppings = Seq[Topping]()
    p.copy(toppings = newToppings)
  }

  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza = {
    p.copy(crustSize = cs)
  }

  def updateCrustType(p: Pizza, ct: CrustType): Pizza = {
    p.copy(crustType = ct)
  }

  def calculatePizzaPrice(
                           p: Pizza,
                           toppingsPrices: Map[Topping, Money],
                           crustSizePrices: Map[CrustSize, Money],
                           crustTypePrices: Map[CrustType, Money]
                         ): Money = {
    // TODO implement a real algorithm based on those sequences
    val base = BigDecimal(10)
    val numToppings = p.toppings.size
    val price = base + 1.00 * numToppings
    price
  }

}
