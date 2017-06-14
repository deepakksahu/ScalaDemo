/**
  * Created by kogentix on 08-06-2017.
  */
object physcoTest {

  def main(args: Array[String]): Unit = {
    /* val v = */jobOffer(Array(1,3,5,6,8),Array(2),Array(6))
    /* println(v)*/
  }

  def jobOffer(scores: Array[Int], lowerLimits: Array[Int], upperLimits: Array[Int]): Array[Int] = {
    val resultList = new scala.collection.mutable.ArrayBuffer[Int]
    var i = 0
    while ( {
      i < lowerLimits.length
    }) {
      var count = 0
      var j = 0
      while ( {
        j < scores.length
      }) {
        val score = scores(j)
        val lowerVal = lowerLimits(i)
        val upperVal = upperLimits(i)
        if (score >= lowerVal && score <= upperVal) count += 1

        {
          j += 1
        }
      }
      resultList.append(count)

      {
        i += 1
      }
    }
    System.out.println(resultList)
    val array = resultList.toArray
    array
  }

}
