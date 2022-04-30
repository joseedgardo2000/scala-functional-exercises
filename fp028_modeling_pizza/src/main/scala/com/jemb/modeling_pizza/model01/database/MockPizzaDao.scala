package com.jemb.modeling_pizza.model01.database

import com.jemb.modeling_pizza.Money
import com.jemb.modeling_pizza.model01.model.{Cheese, CrustSize, CrustType, LargeCrustSize, MediumCrustSize, Mushrooms, Pepperoni, RegularCrustType, Sausage, SmallCrustSize, ThickCrustType, ThinCrustType, Topping}

object MockPizzaDao extends PizzaDaoInterface {
  override def getToppingPrices: Map[Topping, Money] = {
    Map(
      Cheese -> BigDecimal(1),
      Pepperoni -> BigDecimal(1),
      Sausage -> BigDecimal(1),
      Mushrooms -> BigDecimal(1)
    )
  }

  override def getCrustSizePrices: Map[CrustSize, Money] = {
    Map(
      SmallCrustSize -> BigDecimal(0),
      MediumCrustSize -> BigDecimal(1),
      LargeCrustSize -> BigDecimal(2)
    )
  }

  override def getCrustTypePrices: Map[CrustType, Money] = {
    Map(
      RegularCrustType -> BigDecimal(0),
      ThickCrustType -> BigDecimal(1),
      ThinCrustType -> BigDecimal(1)
    )
  }
}
