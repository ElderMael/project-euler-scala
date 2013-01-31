package org.mael.euler.scala

import scala.runtime.RichDouble

object ImpatientChapterTwo {

  def signum(number: Double) = {
    if (number == 0) 0 else if (number > 0) 1 else -1
  }                                               //> signum: (number: Double)Int

  val signumOfThree = signum(3)                   //> signumOfThree  : Int = 1

  val signumOfZero = signum(0)                    //> signumOfZero  : Int = 0

  val signumOfMinusThree = signum(-3)             //> signumOfMinusThree  : Int = -1

  val typeOfEmptyBlock = {}                       //> typeOfEmptyBlock  : Unit = ()

  var y = 2                                       //> y  : Int = 2

  var x = y = 1                                   //> x  : Unit = ()

  val clazz = ().getClass                         //> clazz  : java.lang.Class[Unit] = void

  println(clazz)                                  //> void

  for (i <- (0 to 10).reverse) println(i)         //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0

  def countdown(from: Int) = {
    (0 to from).reverse
  }                                               //> countdown: (from: Int)scala.collection.immutable.Range

  for (j <- countdown(5)) println(j)              //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0

  for (l <- "Hello".toSeq) println(l.toByte)      //> 72
                                                  //| 101
                                                  //| 108
                                                  //| 108
                                                  //| 111

  "Hello".foreach(letter => println(letter.toByte))
                                                  //> 72
                                                  //| 101
                                                  //| 108
                                                  //| 108
                                                  //| 111

  def product(s: String) = {
    for (c <- s.toSeq) yield c.toByte
  }                                               //> product: (s: String)Seq[Byte]

  product("Hello").foreach(println(_))            //> 72
                                                  //| 101
                                                  //| 108
                                                  //| 108
                                                  //| 111

  def recursiveProduct(s: String) {
    if (s isEmpty) return
    println((s take 1)(0) toByte)
    recursiveProduct(s takeRight (s.length - 1))
  }                                               //> recursiveProduct: (s: String)Unit

  recursiveProduct("Hello")                       //> 72
                                                  //| 101
                                                  //| 108
                                                  //| 108
                                                  //| 111

  def power(x: Double, n: Int): Double = {
    scala.math.pow(x,n)
  }                                               //> power: (x: Double, n: Int)Double

	power(3,3)                                //> res0: Double = 27.0
}