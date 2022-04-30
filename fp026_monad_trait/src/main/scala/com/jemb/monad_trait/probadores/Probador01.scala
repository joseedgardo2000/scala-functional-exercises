package com.jemb.monad_trait.probadores
import com.jemb.monad_trait.enums.{PRU01, PruEnum}
import com.jemb.monad_trait.monadas.{IO, Monad, StateT}

object Probador01 extends Probador {

  implicit val IOMonad = new Monad[IO] {
    def lift[A](a: => A): IO[A] = {
      IO(a)
    }
    def flatMap[A, B](ma: IO[A])(f: A => IO[B]): IO[B] = ma.flatMap(f)
  }

  case class IntState(i: Int)

  def add(i: Int) = StateT[IO, IntState, Int] { oldState =>
    val newValue = i + oldState.i
    val newState = oldState.copy(i = newValue)
    IO(newState, newValue)
  }

  def multiply(i: Int) = StateT[IO, IntState, Int] { oldState =>
    val newValue = i * oldState.i
    val newState = oldState.copy(i = newValue)
    IO(newState, newValue)
  }

  def prueba01():Unit = {

    val a = add(1)                           //StateT[IO, IntState, Int]
    val b = a.run(IntState(1))               //IO[(IntState, Int)]
    b.map(t => println(s"b state = ${t._1}"))

    // a hard-coded example
    val forExpression: StateT[IO, IntState, Int] = for {
      _ <- add(2)        //3
      _ <- add(3)        //6
      x <- multiply(10)  //6x10
    } yield x
    // “run” the state
    val result: IO[(IntState, Int)] = forExpression.run(IntState(1))

    // print the final state
    result.map(tuple => println(s"IntState = ${tuple._1}"))
  }

  override def selPrueba(op: PruEnum): Unit = op match {
    case PRU01 => prueba01()
  }

  override def ejecutar(): Unit = {
    println(s"--------------- ejecutar $this---------------")
    selPrueba(PRU01)
    println("----------------------------------------------")
  }
}
