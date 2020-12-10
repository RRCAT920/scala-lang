package fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/9 22:23
 */
object GreetForEach extends App {
  (1 to 3).foreach(i => print(s"$i,"))
  println("Scala Rocks!!!")
}
