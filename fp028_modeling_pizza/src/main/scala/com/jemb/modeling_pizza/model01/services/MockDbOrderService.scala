package com.jemb.modeling_pizza.model01.services

import com.jemb.modeling_pizza.model01.database.{MockPizzaDao, PizzaDaoInterface}

object MockDbOrderService extends AbstractOrderService {
  val database:PizzaDaoInterface = MockPizzaDao
}
