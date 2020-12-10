package basic.fromjavatoscala

/**
 * @author huzihao
 * @since 2020/12/10 16:18
 */
object ImplicitParameters extends App {

  class Wifi(name: String) {
    override def toString: String = name
  }

  def connectToNetwork(user: String)(implicit wifi: Wifi): Unit = {
    println(s"用户 $user 连接到WIFI $wifi")
  }

  def atOffice(): Unit = {
    println("----在办公室----")

    implicit def officeNetwork: Wifi = new Wifi("办公室WIFI")

    val cafeteriaNetwork = new Wifi("咖啡厅WIFI")

    //  先去买了杯咖啡，后工作
    val user = "李容蓉"
    connectToNetwork(user)(cafeteriaNetwork)
    connectToNetwork(user)
  }

  def atHome(): Unit = {
    println("----在家----")

    implicit def homeNetwork: Wifi = new Wifi("家庭WIFI")

    val guMingNetWork = new Wifi("古茗WIFI")

    // 先买了杯奶茶，后回家休息
    val user = "李容蓉"
    connectToNetwork(user)(guMingNetWork)
    connectToNetwork(user)
  }

  atOffice()
  atHome()
}
