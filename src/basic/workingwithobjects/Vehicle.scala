package basic.workingwithobjects

/**
 * @author huzihao
 * @since 2020/12/10 21:35
 */
class Vehicle(val id: Int, val year: Int) {
  override def toString: String = s"ID: $id Year: $year"
}

class Car(override val id: Int, override val year: Int, var fuelLevel: Int)
  extends Vehicle(id, year) {
  override def toString: String = s"${super.toString} Fuel Level: $fuelLevel"
}

object CarApp extends App {
  val car = new Car(1, 2015, 94)
  println(car)
}