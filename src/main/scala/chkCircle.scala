package com.scala.practice

import scala.math._
import scala.collection.mutable.ArrayBuffer

object chkCircle {

  def main(args: Array[String]): Unit = {
    val cir = chkCircle(2, Array("12 0 21 14 0 23", "12 0 21 14 0 23"))
    cir.foreach(println)
  }

  def chkCircle(n: Int, info: Array[String]): Array[String] = {

    var result = ArrayBuffer[String]()

    //val Circle = Array("12 0 21 14 0 23", "12 0 21 14 0 23")
    val Circle = info
    var cir = ""

    for (i <- 0 until n) {
      cir = Circle(i)
      val circle = cir.split(" ").map(x => x.toInt)

      // Calculate radius,distance and relative distances
      val radius1 = circle(2)
      val radius2 = circle(5)
      val dist = sqrt((pow((circle(0) - circle(3)), 2) + pow((circle(1) - circle(4)), 2)))
      val radiusSub = abs(radius1 - radius2)
      val radiusSum = abs(radius1 + radius2)
      // Finding the relation b/w given circles
      if (dist == radiusSum) result += "Touching"
      else if (dist == radiusSub) result += "Touching"
      else if (dist > radiusSum) result += "Disjoint-Outside"
      else if (dist > radiusSum && (dist > 0)) result += "Disjoint-Inside"
      else if (dist == 0) result += "Concentric"
      else if ((radiusSub < dist) && dist < radiusSum) result += "Intersecting"

    }
    result.toArray
  }
}