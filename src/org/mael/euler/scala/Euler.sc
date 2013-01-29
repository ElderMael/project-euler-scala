package org.mael.euler.scala

/**
 * Project Euler Scala Sheet
 *
 * @author ElderMael
 */

object Euler {

  def problem1: Int = {
    (1 until 1000).view.filter(x => x % 3 == 0 || x % 5 == 0).sum
  }                                               //> problem1: => Int

  val r1 = problem1                               //> r1  : Int = 233168

  // Problem 2
  def problem2: Int = {
    lazy val fs: Stream[Int] = 0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)

    fs.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  }                                               //> problem2: => Int

  val r2 = problem2                               //> r2  : Int = 4613732

}