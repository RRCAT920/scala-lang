package basic.fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/9 22:46
 */
object MultipleAssigment extends App {
  def getPersonInfo(primaryKey: Int) = {
    // 假设根据primaryKey返回用户信息
    ("Rongrong", "Li", "1033914768@qq.com")
  }

  val (firstName, lastName, emailAddress) = getPersonInfo(1)
  println(s"First Name: $firstName")
  println(s"Last Name: $lastName")
  println(s"Email Address: $emailAddress")

  val info = getPersonInfo(2)
  println(s"First element: ${ info._1 }")
}
