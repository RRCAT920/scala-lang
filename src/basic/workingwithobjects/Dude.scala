package basic.workingwithobjects

import scala.beans.BeanProperty

/**
 * @author huzihao
 * @since 2020/12/10 21:12
 */
class Dude(@BeanProperty val firstName: String, val lastName: String) {
  @BeanProperty var position: String = _
}
