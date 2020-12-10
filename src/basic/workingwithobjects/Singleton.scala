package basic.workingwithobjects

import scala.collection.mutable

class Marker(val color: String) {
  println(s"创建 $this")

  override def toString: String = s"marker color $color"
}

object MarkerFactory {
  private val markers = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow")
  )

  def getMarker(color: String): Marker = markers.getOrElseUpdate(color, new Marker(color))
}

object MarkerApp extends App {
  println(MarkerFactory getMarker "red")
  println(MarkerFactory getMarker "red")
  println(MarkerFactory getMarker "blue")
  println(MarkerFactory getMarker "blue")
  println(MarkerFactory getMarker "green")
}