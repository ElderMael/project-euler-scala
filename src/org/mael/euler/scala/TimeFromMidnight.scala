package org.mael.euler.scala

class TimeFromMidnight(val hours: Int, val minutes: Int) {

  private val minutesSinceMidnight = (hours * 60) + minutes

  def before(other: TimeFromMidnight): Boolean = {
    this.minutesSinceMidnight > other.minutesSinceMidnight
  }

}