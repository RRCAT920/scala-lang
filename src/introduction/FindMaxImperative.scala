package introduction

/**
 * @author huzihao
 * @since 2020/12/9 15:57
 */
object FindMaxImperative extends App {
  def findMax0(temperatures: List[Int]): Int = {
    var maxT = Int.MinValue
    for (elem <- temperatures) maxT = Math.max(maxT, elem)
    maxT
  }

  def findMax1(temperatures: List[Int]): Int = {
    temperatures.foldLeft(Int.MinValue) { Math.max }
  }

  def findMin(temperatures: List[Int]): Int = {
    temperatures.foldLeft(Int.MaxValue) { Math.min }
  }

  val temperatures = List(2200, 12030, 1203, 300)
  println(s"Max0: ${findMax0(temperatures)}")
  println(s"Max1: ${findMax1(temperatures)}")
  println(s"Min: ${findMin(temperatures)}")
}
