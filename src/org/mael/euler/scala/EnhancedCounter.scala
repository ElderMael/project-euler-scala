package org.mael.euler.scala

class EnhancedCounter {

  private var value = 0 // You must initialize the ﬁeld

  def increment() { // Methods are public by default
    if (value != Integer.MAX_VALUE)
      value += 1
  }

  def current() = value
}