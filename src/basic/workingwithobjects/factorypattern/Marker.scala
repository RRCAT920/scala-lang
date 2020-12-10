package basic.workingwithobjects.factorypattern

import basic.workingwithobjects.MarkerFactory

import scala.collection.mutable

/**
 * @author huzihao
 * @since 2020/12/10 22:20
 */
class Marker private(val color: String) {
  println(s"创建 $this")

  override def toString: String = s"marker color $color"
}

object Marker {
  private val markers = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow")
  )

  def getMarker(color: String): Marker =
    markers.getOrElseUpdate(color, new Marker(color))
}

object MarkerApp extends App {
  println(MarkerFactory getMarker "red")
  println(MarkerFactory getMarker "red")
  println(MarkerFactory getMarker "blue")
  println(MarkerFactory getMarker "blue")
  println(MarkerFactory getMarker "green")
}
