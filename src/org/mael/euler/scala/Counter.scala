package org.mael.euler.scala

class Counter {

  private var value = 0 // You must initialize the ﬁeld

  def increment() { // Methods are public by default
    value += 1
  }

  def current() = value

}