//import scala.collection.immutable.Stack

/**
  * Created by kogentix on 07-06-2017.*/
object balancedOrNt {

  def main(args: Array[String]): Unit = {
    val v = balancedOrNot(Array("<<<><><>"),Array(2))
   v.foreach(println)
  }

  def balancedOrNot(expressions: Array[String], maxReplacements: Array[Int]): Array[Int] = {
    val arrLen = expressions.length
    val result = new Array[Int](arrLen)
    var i = 0
    while ( {
      i < arrLen
    }) {
      val input = expressions(i)
      val strLen = input.length
      var inputArr = new Array[Char](strLen)
      inputArr = input.toCharArray
      var lessThanCount = 0
      var grtThanCount = 0
      var j = 0
      while (j < strLen) {
        if (inputArr(j) == '<') {
          lessThanCount += 1
        }
        else
          grtThanCount += 1
          j += 1
      }
      if (lessThanCount == grtThanCount && inputArr(strLen - 1) != '<') result(i) = 1
      else if ((grtThanCount - lessThanCount <= maxReplacements(i)) && inputArr(strLen - 1) != '<') result(i) = 1
      else result(i) = 0

      {
        i += 1
      }
    }
    return result
  }

}
