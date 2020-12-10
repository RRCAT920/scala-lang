package basic.workingwithobjects

/**
 * @author huzihao
 * @since 2020/12/10 20:39
 */
class Construct(param: String) {
  println(s"用参数${param}创建一个Construct实例")
}

object Construct extends App {
  new Construct("param")
}
