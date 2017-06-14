/**
  * Created by kogentix on 08-06-2017.
  */
import scala.util.control.Breaks._
object buyTicket {

  def main(args: Array[String]): Unit = {
    /*println("jhgacsacsdag  " +*/waitingTime(Array(2,6,3,4,5),2)
  }
  def waitingTime(tickets: Array[Int], p: Int): Long = {
    val noOfTickets: Int = tickets(p)
    var seconds: Int = 0
    val ticketsLen: Int = tickets.length
    // Get the waiting time
    for (i <-1 to noOfTickets)
      breakable {
        for (j <- 0 until ticketsLen if tickets(j) >= i) {
          {
            seconds += 1
            if (i == noOfTickets && j == p) {
              break
            }
          }
        }
      }
    println(seconds)
    seconds
  }
}
