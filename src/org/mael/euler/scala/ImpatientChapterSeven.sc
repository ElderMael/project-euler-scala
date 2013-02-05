package org.mael.euler.scala

object ImpatientChapterSeven {

  println(org.mael.euler.scala.random.nextInt())  //> 53264831

}

object MapUtils {

  import java.util.{ Map => JavaMap }
  import scala.collection.mutable.{ Map => ScalaMap }
  import scala.collection.JavaConversions._

  def toScalaMap[K, V](map: JavaMap[K, V]): ScalaMap[K, V] = {
    mapAsScalaMap(map)
  }
}