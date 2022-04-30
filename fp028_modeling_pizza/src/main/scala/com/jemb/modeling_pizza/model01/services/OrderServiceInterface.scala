package com.jemb.modeling_pizza.model01.services

import com.jemb.modeling_pizza.Money
import com.jemb.modeling_pizza.model01.database.PizzaDaoInterface
import com.jemb.modeling_pizza.model01.model.Order

trait OrderServiceInterface {
  // implementing classes should provide their own database
  // that is an instance of PizzaDaoInterface, such as
  // MockPizzaDao, TestPizzaDao, or ProductionPizzaDao
  protected def database: PizzaDaoInterface

  def calculateOrderPrice(o: Order): Money

}
