package org.mael.euler.scala.chaptereight

import scala.collection.mutable.ArrayBuffer

abstract class Item {

  def price: Double

  def description: String

}

class SimpleItem(val price: Double, val description: String) extends Item {

}

class Bundle(val items: ArrayBuffer[Item]) extends Item {

  override def price: Double = {
    this.items.map(_.price).sum
  }

  override def description: String = {
    this.items.map(_.description).mkString
  }

  def addItem(item: Item) = {
    this.items += item
  }

}