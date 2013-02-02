package org.mael.euler.scala

class Person2(private val fullName: String) {

  val firstName = fullName.split(" ")(0)
  val lastName = fullName.split(" ")(1)

}