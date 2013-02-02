package org.mael.euler.scala

class Time(val hours: Int, val minutes: Int) {

  def before(other: Time): Boolean = {
    if ((this.hours == other.hours) && (this.minutes == other.minutes)) false
    else if (this.hours > other.hours) true
    else if ((this.hours == other.hours) && (this.minutes > other.minutes)) false
    else true
  }
}