package basic.workingwithobjects

/**
 * @author huzihao
 * @since 2020/12/10 21:50
 */
object Parameterized extends App {
  def echo[T](input1: T, input2: T): Unit =
    println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")

  echo("hello", "world")
  echo(1, 2)
  echo("hello", 1)

  printf("%n类使用参数化类型%n")
  val msg1: Message[String] = new Message("rongrong")
  val msg2 = new Message(123)

  println(msg1)
  println(msg1.is("rongrong"))
  println(msg1.is("cat"))
  println(msg2.is(456))
}

class Message[T](val content: T) {
  override def toString: String = s"Content: $content"

  def is(value: T): Boolean = value == content
}