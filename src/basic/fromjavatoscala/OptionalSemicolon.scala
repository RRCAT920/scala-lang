package basic.fromjavatoscala

import java.util

/**
 * @author huzihao
 * @since 2020/12/10 19:02
 */
object OptionalSemicolon extends App {
  val list1 = new util.ArrayList[Int];
  {
    println("创建List1")
  }

  // 匿名内部类
  val list2 = new util.ArrayList[Int] {
    println("创建List2")
  }

  println(list1.getClass)
  println(list2.getClass)
}
