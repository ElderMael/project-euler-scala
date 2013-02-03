package org.mael.euler.scala

object ImpatientChapterSix {

  println(Convertions.inchesToCentimeters(5))     //> 12.7
  println(Convertions.gallonsToLiters(2))         //> 7.57082
  println(Convertions.milesToKilometers(2))       //> 3.21868

  println(InchesToCentimeters.convert(5))         //> 12.7
  println(GallonsToLiters.convert(2))             //> 3.21868
  println(MilesToKilometers.convert(2))           //> 3.21868

  val origin = new Origin(0, 0)                   //> origin  : org.mael.euler.scala.Origin = org.mael.euler.scala.Origin[x=0,y=0]
                                                  //| 

  println(CardSuits.Spades)                       //> ♠
  println(CardSuits.Hearts)                       //> ♥
  println(CardSuits.Diamonds)                     //> ♦
  println(CardSuits.Clubs)                        //> ♣

  println(CardSuits.isRed(CardSuits.Hearts))      //> true
  println(CardSuits.isRed(CardSuits.Spades))      //> false

}

object CardSuits extends Enumeration {
  val Spades = Value("♠")
  val Hearts = Value("♥")
  val Diamonds = Value("♦")
  val Clubs = Value("♣")

  def isRed(suit: CardSuits.Value): Boolean = {
    if (Hearts == suit || Diamonds == suit) true
    else false
  }

}

object Convertions {

  def inchesToCentimeters(inches: Double) = {
    inches * 2.54
  }

  def gallonsToLiters(galons: Double) = {
    galons * 3.78541
  }

  def milesToKilometers(miles: Double) = {
    miles * 1.60934
  }

}

abstract class UnitConversion(val ratio: Double) {

  def convert(units: Double): Double

}

object MilesToKilometers extends UnitConversion(1.60934) {
  @Override def convert(units: Double): Double = {
    this.ratio * units
  }
}

object GallonsToLiters extends UnitConversion(1.60934) {
  @Override def convert(units: Double): Double = {
    this.ratio * units
  }
}

object InchesToCentimeters extends UnitConversion(2.54) {
  @Override def convert(units: Double): Double = {
    this.ratio * units
  }
}