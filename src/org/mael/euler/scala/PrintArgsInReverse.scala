package org.mael.euler.scala

class PrintArgsInReverse extends App {

  println("Hello World")

  args.reverse.map(arg => println(arg + " "))

}