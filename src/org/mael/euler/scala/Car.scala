package org.mael.euler.scala

class Car(
  val manufacturer: String, val model: String,
  val modelYear: Int, var licencePlate: String) {

  def this(manufacturer: String, model: String) {
    this(manufacturer, model, -1, "")
  }

  def this(manufacturer: String, model: String, modelYear: Int) {
    this(manufacturer, model, modelYear, "")
  }

  def this(manufacturer: String, model: String, licencePlate: String) {
    this(manufacturer, model, -1, licencePlate)
  }

}