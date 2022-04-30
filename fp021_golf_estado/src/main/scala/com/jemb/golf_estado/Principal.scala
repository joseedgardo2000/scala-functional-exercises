package com.jemb.golf_estado

object Principal {

  def golfeo01():Unit = {
    println("----------- golfeo01 -----------")
    val edo01 = GolfState01(20)
    val edo02 = nextStroke01(edo01, 15)
    val edo03 = nextStroke01(edo02, 0)
    println(s"Estado Final: $edo03")
    println("--------------------------------")
  }

  def golfeo02():Unit = {
    println("----------- golfeo02 -----------")
    val edo00 = GolfState02(List.empty[Int])
    val edo01 = nextStroke02(edo00, 20)
    val edo02 = nextStroke02(edo01, 15)
    val edo03 = nextStroke02(edo02, 0)
    println(s"Estado Final: $edo03")
    println("--------------------------------")
  }

  def golfeo03():Unit = {
    println("----------- golfeo03 -----------")
    val edo00 = List.empty[Int]
    val edo01 = push(edo00,20)
    val edo02 = push(edo01,15)
    val edo03 = push(edo02,0)
    println(s"Estado Final: $edo03")
    println("---------")
    val (e03, es03) = pop(edo03)
    val (e02, es02) = pop(es03)
    val (e01, es01) = pop(es02)
    println(s"pop: $e03")
    println(s"pop: $e02")
    println(s"pop: $e01")
    println("--------------------------------")
  }

  def main(args: Array[String]): Unit = {
    println("============= fp021_golf_estado =============")
    //golfeo01()
    //golfeo02()
    golfeo03()
    println("============= ================= =============")
  }
}
