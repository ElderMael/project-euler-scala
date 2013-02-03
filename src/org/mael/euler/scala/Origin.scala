package org.mael.euler.scala

import java.awt.Point

class Origin(x: Int, y: Int) extends Point {

}

object Origin extends Point {

  def apply(x: Int, y: Int): Origin = {
    new Origin(x, y)
  }

  def apply(origin: Origin) = {
    new Origin(origin.x, origin.y)
  }

  override def toString(): String = {
    "x : " + this.x + ", y : " + this.y
  }

}