package org.mael.euler.scala

package object random {

  private[this] var previous: Int = 32

  def nextInt(): Int = {
    previous = previous * 1664525 + 1013904223 % (2 * 32)
    previous
  }

}