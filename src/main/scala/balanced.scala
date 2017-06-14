/**
  * Created by kogentix on 07-06-2017.
  */
object balanced {

  def main(args: Array[String]): Unit = {
     println("jhgacsacsdag  " +balancedOrNot(Array("<<<<>>","<<<>>>"),Array(2,2)))
  }

def balanced(str: String): Boolean = {
  //val str1: String = str.replaceAll("[<\\>]", "")
  if (str.length == 0) return true
  if (str.contains("<>")) return balanced(str.replaceFirst("\\<\\>", ""))
  return false
}
  def balancedOrNot(expressions:Array[String],  maxReplacements: Array[Int] ): Unit ={
    var i = 0
    while (i < expressions.length) {
      val value = balanced(expressions(i))
      if (value == false) {
        println(value)
        var m = 0
        while (maxReplacements(m) > 0)
          if ((expressions(i).replaceAll("<>", "")) == "<>")
            println(expressions(i).replaceAll("<>", ""))
            m +=1


      }
      i += 1;
      i - 1
    }

  }

  def removeSpaces(str: String): Unit = {
    var ourString = ""
    var i = 0
    while ( {
      i < str.length - 1
    }) {
      if (i == 0) ourString = "" + str.charAt(i)
      else if (str.charAt(i - 1) != str.charAt(i)) ourString = ourString + str.charAt(i)

      {
        i += 1; i - 1
      }
    }
    System.out.println(ourString)
  }
}






/*
//import scala.collection.immutable.Stack

/**
  * Created by kogentix on 07-06-2017.
  *
  *
  */

/*object HelloWorld {

  def main(args: Array[String]): Unit = {
    val win = winner(Array(1,2,3), Array(2,1,3), "Even")
    println(win)
  }*/
object HelloWorld {

  def main(args: Array[String]): Unit = {
    val v = balancedOrNot("<>")
    println(v)
  }

    def balancedOrNot(symbolString: String): Unit = {
      val s = new scala.collection.mutable.Stack[String] // Stack()
      var balanced = true
      var index = 0
      // val Chk=(index < symbolString.length && balanced)
      while (index < symbolString.length && balanced) {
        val symbol = symbolString.charAt(index).toString
        //println(symbol)
        if (symbol == "<")
          s.push(symbol)
        else if (s.isEmpty)
          balanced = false
        else
          s.pop()
        index = index + 1

        if (balanced && s.isEmpty)
          return true
        else
          return false

      }
    }

}

*/
