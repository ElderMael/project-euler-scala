package org.mael.euler.scala

import scala.reflect.BeanProperty

class Student(
  @BeanProperty var id: Long,
  @BeanProperty var name: String) {

}