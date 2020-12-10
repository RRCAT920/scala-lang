package basic.fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/10 15:43
 */
object Parameters extends App {
  def max(values: Int*) = values.foldLeft(values(0)) {
    Math.max
  }

  println(max(8, 2, 3))

  def function(input: Int*): Unit = println(input.getClass)
  function(1, 2, 3)

  val numbers = Array(2, 5, 3, 7, 1, 6)
  println(max(numbers: _*))
}
