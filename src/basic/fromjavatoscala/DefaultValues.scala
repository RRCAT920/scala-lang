package basic.fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/10 15:51
 */
object DefaultValues extends App {
  def mail(destination: String = "head office", mailClass: String = "first"): Unit = {
    println(s"sending to $destination by $mailClass class")
  }
}
