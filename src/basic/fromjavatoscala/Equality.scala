package basic.fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/10 18:55
 */
object Equality extends App {
  val str1 = "hello"
  val str2 = "hello"
  val str3 = new String("hello")

  println(str1 == str2)
  println(str1 eq str2)
  println(str1 == str3)
  println(str1 eq str3)
}
