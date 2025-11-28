import java.util.*

fun main(args: Array<String>) {
  val A = readLine()!!.toDouble() * 2
  val B = readLine()!!.toDouble() * 3
  val C = readLine()!!.toDouble() * 5
  val MEDIA = String.format("%.1f", (A + B +C)/10)
  println("MEDIA = ${MEDIA}")	
}