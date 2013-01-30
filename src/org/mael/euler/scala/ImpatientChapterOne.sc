package org.mael.euler.scala

import scala.math.BigInt._
import scala.util.Random

object ImpatientChapterOne {

  val H = "Hello"(0)                              //> H  : Char = H

  val o = "Hello".last                            //> o  : Char = o

  val takingThree = "Hello" take 4                //> takingThree  : String = Hell

  val dropThree = "Hello" drop 4                  //> dropThree  : String = o

  val dropRightThree = "Hello" dropRight 3        //> dropRightThree  : String = He

  val takeRightThree = "Hello" takeRight 3        //> takeRightThree  : String = llo

  val bigRandom = probablePrime(100, Random)      //> bigRandom  : scala.math.BigInt = 1201613587277428106193657774073

  val squareRoot = scala.math.sqrt(3)             //> squareRoot  : Double = 1.7320508075688772

  val square = scala.math.pow(squareRoot, 2)      //> square  : Double = 2.9999999999999996

  val biggie = BigInt(2).pow(1024)                //> biggie  : scala.math.BigInt = 1797693134862315907729305190789024733617976978
                                                  //| 9423065727343008115773267580550096313270847732240753602112011387987139335765
                                                  //| 8789768814416622492847430639474124377767893424865485276302219601246094119453
                                                  //| 0829520850057688381506823424628814739131105408272371633505106845862982399472
                                                  //| 45938479716304835356329624224137216

}