package basic.workingwithobjects

/**
 * @author huzihao
 * @since 2020/12/10 20:25
 */
class UserCar(val year: Int) {
  private var milesDriven = 0

  def miles: Int = milesDriven

  def drive(distance: Int): Unit = {
    milesDriven += Math.abs(distance)
  }
}