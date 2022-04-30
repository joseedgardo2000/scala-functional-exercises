package com.jemb.modeling_pizza.model02.database

import com.jemb.modeling_pizza.model02.Money
import com.jemb.modeling_pizza.model02.enums.{Cheese, CrustSize, Mushrooms, Pepperoni, Sausage}
import com.jemb.modeling_pizza.model02.enums.Topping
import com.jemb.modeling_pizza.model02.enums.SmallCrustSize
import com.jemb.modeling_pizza.model02.enums.MediumCrustSize
import com.jemb.modeling_pizza.model02.enums.LargeCrustSize
import com.jemb.modeling_pizza.model02.enums.CrustType
import com.jemb.modeling_pizza.model02.enums.RegularCrustType
import com.jemb.modeling_pizza.model02.enums.ThickCrustType
import com.jemb.modeling_pizza.model02.enums.ThinCrustType

object MockPizzaDao {
  def getToppingPrices(): Map[Topping, Money] = {
    Map(
      Cheese    -> BigDecimal(1),
      Pepperoni -> BigDecimal(1),
      Sausage   -> BigDecimal(1),
      Mushrooms -> BigDecimal(1)
    )
  }

  def getCrustSizePrices(): Map[CrustSize, Money] = {
    Map(
      SmallCrustSize  -> BigDecimal(0),
      MediumCrustSize -> BigDecimal(1),
      LargeCrustSize  -> BigDecimal(2)
    )
  }

  def getCrustTypePrices(): Map[CrustType, Money] = {
    Map(
      RegularCrustType -> BigDecimal(0),
      ThickCrustType   -> BigDecimal(1),
      ThinCrustType    -> BigDecimal(1)
    )
  }
}
