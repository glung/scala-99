import scala.collection.immutable.Nil

object P01 {

  def last[A](list: List[A]): Option[A] = {
    list match {
      case Nil => None
      case element :: Nil => Some(element)
      case element :: tail => last(tail)
    }
  }

}
