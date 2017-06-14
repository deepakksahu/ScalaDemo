import scala.collection.mutable.ArrayBuffer

/**
  * Created by kogentix on 08-06-2017.
  */
//object maxSub {

  object SubsetSum {

    def main(args: Array[String]): Unit = {
      val max = maxSubsetSum(2, Array(2,4))
      max.foreach(println)
    }

    def maxSubsetSum(n: Int, x: Array[Int]) : Array[Int] =  {

      var value = 0
      var SubsetArr = ArrayBuffer[Int]()
      var i = 0
      while(i < n) {
        var Subsum = 0
        value = x(i)

        for (j <- 1 to value if j <= value) {
          if (value % j == 0)
            Subsum += j
        }
        SubsetArr += Subsum
        i +=1

      }

      SubsetArr.toArray

    }

}
