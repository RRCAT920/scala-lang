package basic.fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/10 16:45
 */
object StringInterpolation extends App {
  val product = "ticket"
  val price = 25.12
  val discount = 10
  println(s"On $product $discount% saves $$${price * discount / 100.00}")
}
