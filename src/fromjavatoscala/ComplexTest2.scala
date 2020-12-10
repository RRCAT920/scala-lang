package fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/10 17:24
 */
object ComplexTest2 extends App {

  class Complex(val real: Int, val imaginary: Int) {
    def +(operand: Complex): Complex = {
      // 口诀：实加实，虚加虚
      println("复数加法")
      new Complex(real + operand.real, imaginary + operand.imaginary)
    }

    def *(operand: Complex): Complex = {
      // 口诀：实实-虚虚，虚实+虚实
      println("复数乘法")
      new Complex(real * operand.real - imaginary * operand.imaginary,
        real * operand.imaginary + imaginary * operand.real)
    }

    override def toString: String = {
      val sign = if (imaginary < 0) "" else "+"
      s"$real$sign${imaginary}i"
    }
  }

  val c1 = new Complex(1, 4)
  val c2 = new Complex(2, -3)
  val c3 = new Complex(2, 2)
  println(c1 + c2 * c3)
}
