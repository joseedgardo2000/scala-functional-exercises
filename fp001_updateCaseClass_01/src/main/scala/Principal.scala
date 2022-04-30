object Principal {
  case class Persona(nombre:String, edad:Int)
  def main(args:Array[String]):Unit = {
    println("============= FP001_Update =============")
    val luisaOld = Persona("Luisa", 43)
    val luisaNew = luisaOld.copy(edad = 22)
    println(s"Original: $luisaOld")
    println(s"Nueva: $luisaNew")
    println("============= ============ =============")
  }
}