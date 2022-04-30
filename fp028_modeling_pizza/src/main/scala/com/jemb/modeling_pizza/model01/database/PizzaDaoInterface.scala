package com.jemb.modeling_pizza.model01.database

import com.jemb.modeling_pizza.Money
import com.jemb.modeling_pizza.model01.model.{CrustSize, CrustType, Topping}

trait PizzaDaoInterface {
  def getToppingPrices: Map[Topping, Money]
  def getCrustSizePrices: Map[CrustSize, Money]
  def getCrustTypePrices: Map[CrustType, Money]
}
