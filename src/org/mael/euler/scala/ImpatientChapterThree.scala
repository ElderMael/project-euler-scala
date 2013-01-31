package org.mael.euler.scala

import scala.collection.mutable.ArrayBuffer
import java.awt.datatransfer._

object ImpatientChapterThree {

  def randomArray(elements: Int) = {
    val a = new Array[Int](elements)

    for (elem <- a) yield elem + (math.random * 10).toInt

  }                                               //> randomArray: (elements: Int)Array[Int]

  val a = randomArray(10)                         //> a  : Array[Int] = Array(0, 9, 5, 5, 1, 2, 5, 8, 9, 3)

  def swapArray(array: Array[Int]) = {
    a.grouped(2).flatMap(_.reverse).toArray
  }                                               //> swapArray: (array: Array[Int])Array[Int]

  def swapArrayWithFor(array: Array[Int]) = {
    (for { b <- a.grouped(2); c <- b.reverse } yield c).toArray
  }                                               //> swapArrayWithFor: (array: Array[Int])Array[Int]

  val swappy = swapArrayWithFor(a)                //> swappy  : Array[Int] = Array(9, 0, 5, 5, 2, 1, 8, 5, 3, 9)

  val swaped = swapArray(a)                       //> swaped  : Array[Int] = Array(9, 0, 5, 5, 2, 1, 8, 5, 3, 9)

  def orderByPositive(array: Array[Int]) = {
    val bufferPos = new ArrayBuffer[Int]()
    val bufferZero = new ArrayBuffer[Int]()
    val bufferNeg = new ArrayBuffer[Int]()

    for (elem <- array) {
      if (elem > 0) bufferPos += elem
      else if (elem < 0) bufferNeg += elem
      else bufferZero += elem
    }

    bufferPos appendAll bufferZero
    bufferPos appendAll bufferNeg

    bufferPos
  }                                               //> orderByPositive: (array: Array[Int])scala.collection.mutable.ArrayBuffer[Int
                                                  //| ]

  val buffer = new ArrayBuffer[Int]               //> buffer  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()

  buffer.append(-1, 3, 6, -2, 0, 5, 5)

  val ordered = orderByPositive(buffer.toArray)   //> ordered  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(3, 6, 5,
                                                  //|  5, 0, -1, -2)

  ordered.mkString("[", ",", "]")                 //> res0: String = [3,6,5,5,0,-1,-2]

  def average(array: Array[Double]) = {
    array.sum / array.length
  }                                               //> average: (array: Array[Double])Double

  val toBeAveraged = new ArrayBuffer[Double]()    //> toBeAveraged  : scala.collection.mutable.ArrayBuffer[Double] = ArrayBuffer(
                                                  //| )

  toBeAveraged.append(.1, .2, .3, .4, .5, .6);

  val avg = average(toBeAveraged.toArray)         //> avg  : Double = 0.35000000000000003

  ordered.reverse.mkString("[", ",", "]")         //> res1: String = [-2,-1,0,5,5,6,3]

  ordered.reverse.distinct.mkString("[", ",", "]")//> res2: String = [-2,-1,0,5,6,3]

  val timezones = java.util.TimeZone.getAvailableIDs
    .filter(tz => tz.contains("America"))
    .map(tz => tz.replaceFirst("America/", ""))
    .mkString("[", ",", "]")                      //> timezones  : String = [Adak,Atka,Anchorage,Juneau,Nome,Sitka,Yakutat,Dawson
                                                  //| ,Ensenada,Los_Angeles,Metlakatla,Santa_Isabel,Tijuana,Vancouver,Whitehorse,
                                                  //| Boise,Cambridge_Bay,Chihuahua,Creston,Dawson_Creek,Denver,Edmonton,Hermosil
                                                  //| lo,Inuvik,Mazatlan,Ojinaga,Phoenix,Shiprock,Yellowknife,Bahia_Banderas,Beli
                                                  //| ze,Cancun,Chicago,Costa_Rica,El_Salvador,Guatemala,Indiana/Knox,Indiana/Tel
                                                  //| l_City,Knox_IN,Managua,Matamoros,Menominee,Merida,Mexico_City,Monterrey,Nor
                                                  //| th_Dakota/Beulah,North_Dakota/Center,North_Dakota/New_Salem,Rainy_River,Ran
                                                  //| kin_Inlet,Regina,Resolute,Swift_Current,Tegucigalpa,Winnipeg,Atikokan,Bogot
                                                  //| a,Cayman,Coral_Harbour,Detroit,Fort_Wayne,Grand_Turk,Guayaquil,Havana,India
                                                  //| na/Indianapolis,Indiana/Marengo,Indiana/Petersburg,Indiana/Vevay,Indiana/Vi
                                                  //| ncennes,Indiana/Winamac,Indianapolis,Iqaluit,Jamaica,Kentucky/Louisville,Ke
                                                  //| ntucky/Monticello,Lima,Louisville,Montreal,Nassau,New_York,Nipigon,Panama,P
                                                  //| angnirtung,Port-au-Prin
                                                  //| Output exceeds cutoff limit.

  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
                                                  //> flavors  : java.awt.datatransfer.SystemFlavorMap = java.awt.datatransfer.Sy
                                                  //| stemFlavorMap@17018cf
}