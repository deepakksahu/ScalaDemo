/*
/**
  * Created by kogentix on 08-06-2017.
  */
object BalancedCheck {
  def balancedOrNot(expressions: Array[String], maxReplacements: Array[Int]): Array[Int] = {
    val results = new Array[Int](expressions.length)
    var i = 0
    while ( {
      i < expressions.length
    }) {
      val value = isBalanced(expressions(i), maxReplacements(i))
      results(i) = value

      {
        i += 1; i - 1
      }
    }
    results
  }

  def isBalanced(expression: String, maxReplacements: Int): Int = {
    var result = 0
    var previousChar = ' '
    var noOdReplacements = 0
    var count1 = 0
    var count2 = 0
    var isFirst = true
    var i = 0
    while ( {
      i < expression.length
    }) {
      val currentChar = expression.charAt(i)
      if (isFirst) {
        isFirst = false
        previousChar = currentChar
        count1 += 1
        continue //todo: continue is not supported
      }
      if (currentChar == '<' && previousChar == currentChar) count1 += 1
      else if (currentChar == '>' && previousChar == currentChar) count2 += 1
      else if (currentChar == '>') count2 += 1
      if (count1 == count2) {
        count1 = 0
        count2 = 0
        result = 1
        continue //todo: continue is not supported
      }
      else if (currentChar == '>' && count1 < count2) if (noOdReplacements < maxReplacements) {
        noOdReplacements += 1
        count2 = 0
      }
      else {
        result = 0
        return result
      }
      else result = 0

      {
        i += 1; i - 1
      }
    }
    result
  }
}
*/
