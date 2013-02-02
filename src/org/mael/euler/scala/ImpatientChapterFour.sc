package org.mael.euler.scala

object ImpatientChapterFour {

  val buying = Map("Milk" -> 12.00, "Cookies" -> 40.0)
                                                  //> buying  : scala.collection.immutable.Map[java.lang.String,Double] = Map(Milk
                                                  //|  -> 12.0, Cookies -> 40.0)

  val afterIVA = buying.mapValues(_ * 1.15)       //> afterIVA  : scala.collection.immutable.Map[java.lang.String,Double] = Map(Mi
                                                  //| lk -> 13.799999999999999, Cookies -> 46.0)

  def maxMin(map: scala.collection.immutable.Map[String, Double]) = {
    (map.values.max, map.values.min)
  }                                               //> maxMin: (map: scala.collection.immutable.Map[String,Double])(Double, Double)
                                                  //| 

  val maxMinTuple = maxMin(afterIVA)              //> maxMinTuple  : (Double, Double) = (46.0,13.799999999999999)

  val strange = "Hello" zip "World" mkString      //> strange  : String = (H,W)(e,o)(l,r)(l,l)(o,d)

  def getSystemPropertiesMap() = {
    scala.collection.JavaConversions.mapAsScalaMap(System.getProperties())
  }                                               //> getSystemPropertiesMap: ()scala.collection.mutable.Map[java.lang.Object,java
                                                  //| .lang.Object]

  def prettyPrintMap(map: scala.collection.immutable.Map[String, String]) = {

  }                                               //> prettyPrintMap: (map: scala.collection.immutable.Map[String,String])Unit
}