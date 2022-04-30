package com.jemb.for_yield

object Principal {
  def forYieldSimple():Unit = {
    println("---------- forYieldSimple ----------")
    val l01a = List(1,2,3,4)
    val l01b = for(i<-l01a) yield i * 2
    println(l01a)
    println(l01b)
    println("---------- -------------- ----------")
  }

  def forYieldIf():Unit = {
    println("---------- forYieldSimple ----------")
    val l01a = List(1,2,3,4)
    val l01b = for(i <- l01a if(i%2==0))  yield i
    println(l01a)
    println(l01b)
    println("---------- -------------- ----------")
  }

  def forYieldAnidado():Unit = {
    val l01 = for {


                i <- 1 to 4
                j <- 6 to 10
                if(i%2==0)
                if(j%2!=0)

              } yield (i,j)
    println(l01)
  }

  def main(args: Array[String]): Unit = {
    println("============= jem006_for_yield =============")
    //forYieldSimple()
    //forYieldIf()
    forYieldAnidado()
    println("============= ================ =============")
  }
}
