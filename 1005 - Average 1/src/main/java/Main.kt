import java.util.*

fun main(args: Array<String>) {
  val A = readLine()!!.toDouble() * 3.5
  val B = readLine()!!.toDouble() * 7.5
  val MEDIA = String.format("%.5f", (A + B)/11)
  println("MEDIA = ${MEDIA}")	
}