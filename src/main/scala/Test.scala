/*
/**
  * Created by kogentix on 06-06-2017.
  */
/*import com.sun.crypto.provider.AESCipher.AES128_CBC_NoPadding*/

import scala.collection.{immutable, mutable}
  object Test {
    def main(args: Array[String]): Unit = {
      val list = List(1, 2, 3).map(_ + 1)
      val imm = collection.immutable.Map(1->"one",2->"Two","Three"->3)
      val m = collection.mutable.Map(imm.toSeq: _*)
      val lol = List(List(-1,6,1,2), List(5,0,8,4)).flatten
      // lol.sortBy(lol->_)
/*println(type)*/
      lol.foreach(println)
    }
  }
*/
