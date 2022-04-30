package com.jemb.modeling_pizza.model01.services

import com.jemb.modeling_pizza.Money
import com.jemb.modeling_pizza.model01.model.{CrustSize, CrustType, Pizza, Topping}

trait PizzaServiceInterface {
  def addTopping(p: Pizza, t: Topping): Pizza
  def removeTopping(p: Pizza, t: Topping): Pizza
  def removeAllToppings(p: Pizza): Pizza
  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza
  def updateCrustType(p: Pizza, ct: CrustType): Pizza
  def calculatePizzaPrice(
                           p: Pizza,
                           toppingsPrices: Map[Topping, Money],
                           crustSizePrices: Map[CrustSize, Money],
                           crustTypePrices: Map[CrustType, Money]
                         ): Money
}
