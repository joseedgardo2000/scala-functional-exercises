package com.jemb.modeling_pizza.model01


import com.jemb.modeling_pizza.model01.model.{Address, Cheese, Customer, LargeCrustSize, MediumCrustSize, Mushrooms, Order, Pepperoni, Pizza, RegularCrustType, Sausage, ThickCrustType}
import com.jemb.modeling_pizza.model01.services.PizzaService

object Probador01 {
  // create a concrete PizzaService instance so i can
  // call its functions
  object PizzaService extends PizzaService

  // import all of its functions
  import PizzaService._

  // create a sample Address
  val address:Address = Address(
    "1 Main Street",
    None,
    "Talkeetna",
    "AK",
    "99676"
  )

  // create a sample Customer
  val customer:Customer = Customer(
    "Alvin Alexander",
    "907-555-1212",
    address
  )

  // start to create an Order for the Customer. notice that
  // this brings up a question, should i have used an Option
  // for the Seq[Pizza] parameter?
  val o1:Order = Order(
    Seq[Pizza](), //TODO use Option here instead?
    customer
  )

  // create a pizza
  val p1:Pizza = Pizza(
    MediumCrustSize,
    RegularCrustType,
    Seq(Cheese)
  )

  // with the current api, this is what you have to do to
  // add a new pizza to an existing order. this tells me
  // that OrderServiceInterface needs an `addPizzaToOrder`
  // function.
  val newPizzas:Seq[Pizza] = o1.pizzas :+ p1
  val o2:Order = o1.copy(pizzas = newPizzas)

  // build another pizza
  val p2:Pizza = Pizza(
    MediumCrustSize,
    RegularCrustType,
    Seq(Cheese)
  )

  def ejecutar():Unit = {
    println("-------- ejecutar Model01 --------")
    println("---->> Se prueba el modelado por MÓDULOS")
    println(this.address)
    println(this.customer)
    println(this.o1)
    println(this.p1)
    println(this.newPizzas)
    println(this.o2)
    println(this.p2)

    // test the PizzaService functions
    val p2a = addTopping(p2, Pepperoni)
    val p2b = addTopping(p2a, Mushrooms)
    val p2c = updateCrustType(p2b, ThickCrustType)
    val p2Last = updateCrustSize(p2c, LargeCrustSize)
    // update the order with the second pizza. again i see
    // that i should have create an `addPizzaToOrder` function.
    val pizzas3 = o2.pizzas :+ p2Last
    val o3 = o2.copy(pizzas = pizzas3)
    println(o3)

    // note that i could have created the second pizza like this
    val p2d = updateCrustSize(
      updateCrustType(
        addTopping(
          addTopping(p2, Pepperoni),
          Mushrooms
        ),
        ThickCrustType
      ),
      LargeCrustSize
    )
    // calculate the price of the current order (o3) using the
    // MockDbOrderService
    import com.jemb.modeling_pizza.model01.services.MockDbOrderService.calculateOrderPrice
    val orderPrice = calculateOrderPrice(o3)
    println(s"Order Price = $orderPrice")
    // i forgot to test `removeTopping`, give it a spin
    val p5 = Pizza(
      MediumCrustSize,
      RegularCrustType,
      Seq(Cheese, Pepperoni, Pepperoni, Sausage)
    )
    val p5a = removeTopping(p5, Pepperoni)
    println("\nSHOULD BE Cheese/Pepperoni/Sausage:")
    println(p5a)
    println("\nSe ha probado el modelado por MÓDULOS <<----")

  }
}
