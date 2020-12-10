package basic.workingwithobjects

/**
 * @author huzihao
 * @since 2020/12/10 20:54
 */
class Person(val firstName: String, val lastName: String) {
  var position: String = _

  println("调用了主构造器")

  def this(firstName: String, lastName: String, positionHeld: String) {
    this(firstName, lastName)
    position = positionHeld
  }

  override def toString: String = s"$firstName ${lastName}的职位为$position"
}

object Person extends App {
  val rongrong = new Person("Rongrong", "Li", "数据分析师")
  println(rongrong)

  val cat = new Person("Cat", "of Rongrong")
  println(cat)
}