/**
  * Created by kogentix on 08-06-2017.
  */
object consSum {

  def main(args: Array[String]): Unit = {
    val cons = consecutive(10)
    println(cons)
  }

  def consecutive(num: Long) : Int = {
    val compNum : Double = num.toDouble
    var count = 0
    for(i <- 1 until compNum.toInt) {
      for(j <- i+1 until compNum.toInt)
      {
        val m = j-i+1;
        val res = ((m/2.0)*(i+j)) ;
        if(res ==compNum)
          count +=1;
      }
    }
    count
  }
}
