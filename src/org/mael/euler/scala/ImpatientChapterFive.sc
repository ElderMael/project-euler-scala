package org.mael.euler.scala

object ImpatientChapterFive {

  val counter = new Counter                       //> counter  : org.mael.euler.scala.Counter = org.mael.euler.scala.Counter@1d9398
                                                  //| d
  val enhancedCounter = new EnhancedCounter       //> enhancedCounter  : org.mael.euler.scala.EnhancedCounter = org.mael.euler.sca
                                                  //| la.EnhancedCounter@8bbdab
  for (i <- 0 until Integer.MAX_VALUE) {
    counter.increment()
    enhancedCounter.increment()
  }

  println(counter.current)                        //> 2147483647
  println(enhancedCounter.current)                //> 2147483647

  counter.increment()
  enhancedCounter.increment()
  println(counter.current)                        //> -2147483648
  println(enhancedCounter.current)                //> 2147483647

  val account = new BankAccount                   //> account  : org.mael.euler.scala.BankAccount = org.mael.euler.scala.BankAccou
                                                  //| nt@ca9651

  println(account.currentBalance)                 //> 0.0

  account deposit 100.0

  println(account.currentBalance)                 //> 100.0

  account withdraw 20

  println(account.currentBalance)                 //> 80.0

  val sixAM = new Time(6, 0)                      //> sixAM  : org.mael.euler.scala.Time = org.mael.euler.scala.Time@166fad9
  val fiveAM = new Time(5, 0)                     //> fiveAM  : org.mael.euler.scala.Time = org.mael.euler.scala.Time@1deef8a

  true == sixAM.before(fiveAM)                    //> res0: Boolean = true

  val sixThirty = new Time(6, 30)                 //> sixThirty  : org.mael.euler.scala.Time = org.mael.euler.scala.Time@1408d95
  val sixForty = new Time(6, 40)                  //> sixForty  : org.mael.euler.scala.Time = org.mael.euler.scala.Time@10f4d89

  true == (sixThirty before sixForty)             //> res1: Boolean = true

  false == (sixForty before sixThirty)            //> res2: Boolean = true

  val sixAMfm = new TimeFromMidnight(6, 0)        //> sixAMfm  : org.mael.euler.scala.TimeFromMidnight = org.mael.euler.scala.Time
                                                  //| FromMidnight@f229cd
  val fiveAMfm = new TimeFromMidnight(5, 0)       //> fiveAMfm  : org.mael.euler.scala.TimeFromMidnight = org.mael.euler.scala.Tim
                                                  //| eFromMidnight@9692d7

  true == (sixAMfm before fiveAMfm)               //> res3: Boolean = true

  val mike = new Student(1L, "Micky")             //> mike  : org.mael.euler.scala.Student = org.mael.euler.scala.Student@7cd80e

  mike setName "Micky"

  val neonate = new Person(-1)                    //> neonate  : org.mael.euler.scala.Person = org.mael.euler.scala.Person@1e7a6a
                                                  //| e

  println(neonate.age)                            //> 0

  val micky = new Person2("Mike Goodness")        //> micky  : org.mael.euler.scala.Person2 = org.mael.euler.scala.Person2@6acdae
                                                  //| 

  println(micky.firstName + " " + micky.lastName) //> Mike Goodness

}