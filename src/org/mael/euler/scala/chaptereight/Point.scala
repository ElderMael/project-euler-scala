package org.mael.euler.scala.chaptereight

class Point(val x: Int, val y: Int) {

}

class LabeledPoint(x: Int, y: Int, val label: String)
  extends Point(x, y) {

}