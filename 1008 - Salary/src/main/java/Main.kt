import java.util.*

fun main(args: Array<String>) {
  val A = readLine()!!.toInt() 
  val B = readLine()!!.toInt() 
  val C = readLine()!!.toDouble()
  val Salary = String.format("%.2f", B * C) 
  println("NUMBER = $A")
  println("SALARY = U$ $Salary")
}