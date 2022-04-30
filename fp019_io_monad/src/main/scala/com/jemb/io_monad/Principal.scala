package com.jemb.io_monad
import com.jemb.io_monad.generales.IO
object Principal {

  def prueba01():Unit  = {
    def prueba01b():IO[Unit]  = {
      IO(println("Hola Mundo"))
    }
    val c = prueba01b()
    c.run
  }

  def prueba02():Unit = {
    def imprime(s:String):IO[Unit] = IO(println(s))
    def devuelvePal():IO[String] = IO({"Sol"})

    val aa = imprime("A")
              .flatMap(_=>imprime("AA")
              .flatMap(_=>imprime("AAA")
              .flatMap(_ => devuelvePal()
              .flatMap(p=>imprime(p)
              .map(_ => p)))))

    //println(aa.run)
    aa.run
  }

  def prueba03():Unit = {
    def imprime(s:String):IO[Unit] = IO(println(s))
    def devuelveA():IO[String] = IO({"A"})
    def aa:IO[String] = for{
      _ <- imprime("hola")
      a <- devuelveA()
      _ <- imprime("Hasta luego")
    } yield a

    aa.run
  }

  def prueba04():Unit = {
    def imprime(s:String):IO[Unit] = IO(println(s))
    def devuelveA():IO[String] = IO({"A"})
    for{
      _ <- imprime("Frase 01")
      a <- devuelveA()
      _ <- imprime(s"Frase 02 [$a]")
    } yield ()

  }

  def prueba05():Unit = {
    def imprime(s:String):IO[Unit] = IO(println(s))
    def devuelvePal():IO[String] = IO({"Sol"})

    val aa = for {
      _ <- imprime("I")
      _ <- imprime("II")
      _ <- imprime("III")
      p <- devuelvePal()
      _ <- imprime(s"IV - $p")
    } yield "Mapa"

    val res = aa.run
    println(s"Res: $res")
  }
  /* CORRIDA DE ESCRITORIO
  val c01 = imprime("I")
  val c02 = (_:Unit) => imprime("II")
  val c03 = (_:Unit) => imprime("III")
  val c04 = (_:Unit) => devuelvePal()
  val c05 = (p:String) => imprime(s"IV - $p")
  val c06 = (_:Unit) => "Mapa"
  val c06b = (a:Unit) => IO(c06(a))

  val ant01 = c01
  val ant02 = IO(c02(ant01.run).run)
  val ant03 = IO(c03(ant02.run).run)
  val ant04 = IO(c04(ant03.run).run)
  val ant05 = IO(c05(ant04.run).run)

  val ant06 = IO(c06b(ant05.run).run)
  */
  def prueba06():Unit = {
    def imprime(s:String):IO[Unit] = IO(println(s))
    def devuelvePal():IO[String] = IO({"Sol"})
    val aa =
      imprime("I")
      .flatMap(_ => imprime("II")
      .flatMap(_ => imprime("III")
      .flatMap(_ => devuelvePal()
      .flatMap(p => imprime(s"IV - $p")
      .map(_=>"Mapa")))))
    val res = aa.run
    println(s"Res: $res")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp019_io_monad =============")
    prueba05()
    println("--------------------")
    prueba06()
    println("============= ============== =============")
  }
}
