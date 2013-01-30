package org.mael.euler.scala

/**
 * Project Euler Scala Sheet
 *
 * @author ElderMael
 */

object Euler {

  def problem1: Int = {
    (1 until 1000).view.filter(x => x % 3 == 0 || x % 5 == 0).sum
  } //> problem1: => Int

  val resultProblem1 = problem1 //> resultProblem1  : Int = 233168

  // Problem 2
  def problem2: Int = {
    lazy val fs: Stream[Int] = 0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)

    fs.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  } //> problem2: => Int

  val resultProblem2 = problem2 //> resultProblem2  : Int = 4613732

  def problem3(number: Double): Int = {

    lazy val primeNumbers: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
      primeNumbers.takeWhile(j => j * j <= i).forall(i % _ > 0))

    val limit = math.sqrt(number)

    primeNumbers.view.takeWhile(_ < limit).filter(number % _ == 0).last

  } //> problem3: (number: Double)Int

  val resultProblem3 = problem3(600851475143.0) //> resultProblem3  : Int = 6857

}