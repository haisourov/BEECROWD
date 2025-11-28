import java.util.*

fun main(args: Array<String>) {
  val A = readLine()!!
  val B = readLine()!!.toDouble() 
  val C = readLine()!!.toDouble()
  val Salary = String.format("%.2f", B + C * 0.15) 
  println("TOTAL = R$ $Salary")
}