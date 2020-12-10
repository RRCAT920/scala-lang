package basic.workingwithobjects

/**
 * @author huzihao
 * @since 2020/12/10 21:28
 */
object CopApp extends App {
  type Cop = PoliceOfficer

  val topCop = new Cop("Jack")
  println(topCop.getClass)
}
