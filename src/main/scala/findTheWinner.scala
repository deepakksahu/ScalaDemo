/**
  * Created by kogentix on 07-06-2017.*/
//package com.scala.practice

import scala.collection.mutable.ArrayBuffer

object findTheWinner {

  def main(args: Array[String]): Unit = {
    val win = winner(Array(1,2,3), Array(2,1,3), "Even")
    println(win)
  }

  def winner(andria: Array[Int], maria: Array[Int], s: String) : String = {
    // get the index based on Odd and Even
    val ind = ArrayBuffer[Int]()
    var k = 0
    for(i <- 0 until andria.length) {
      if (s.equalsIgnoreCase("Even"))
      {
        if (i % 2 == 0) ind += i
      }else if (s.equalsIgnoreCase("Odd")) {
        if (i % 2 == 1)   ind += i
      }

    }
    // Get points for both the players
    var andriaSum = 0
    var mariaSum = 0
    for(i <- 0 until ind.length) {
      val x = ind(i)
      andriaSum += (andria(x) - maria(x))
      mariaSum += (maria(x) - andria(x))
    }
    var result = ""
    if (andriaSum > mariaSum)
      result = "Andria"
    else if (andriaSum < mariaSum)
      result = "Maria"
    else if (andriaSum == mariaSum)
      result = "Tie"
    result
  }

}
