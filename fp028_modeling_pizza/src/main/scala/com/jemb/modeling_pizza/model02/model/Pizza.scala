package com.jemb.modeling_pizza.model02.model

import com.jemb.modeling_pizza.model02.Money
import com.jemb.modeling_pizza.model02.enums.CrustSize
import com.jemb.modeling_pizza.model02.enums.CrustType
import com.jemb.modeling_pizza.model02.enums.Topping
import com.jemb.modeling_pizza.model02.utils.ListUtils

case class Pizza(
                  crustSize: CrustSize,
                  crustType: CrustType,
                  toppings: Seq[Topping]
                ){
  // the operations on the data model

  def addTopping(t: Topping): Pizza = {
    this.copy(toppings = this.toppings :+ t)
  }

  def removeTopping(t: Topping): Pizza = {
    val newToppings = ListUtils.dropFirstMatch(this.toppings, t)
    this.copy(toppings = newToppings)
  }

  def removeAllToppings(): Pizza = {
    val newToppings = Seq[Topping]()
    this.copy(toppings = newToppings)
  }

  def updateCrustSize(cs: CrustSize): Pizza = {
    this.copy(crustSize = cs)
  }

  def updateCrustType(ct: CrustType): Pizza = {
    this.copy(crustType = ct)
  }

  def getPrice(
                toppingPrices: Map[Topping, Money],
                crustSizePrices: Map[CrustSize, Money],
                crustTypePrices: Map[CrustType, Money]
              ): Money = {
    // TODO implement a real algorithm based on those sequences
    val base = BigDecimal(10)
    val numToppings = this.toppings.size
    val price = base + 1.00 * numToppings
    price
  }
}
