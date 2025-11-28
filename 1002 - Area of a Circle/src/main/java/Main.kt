import java.util.*

fun main(args: Array<String>) {

  val pi = 3.14159
  var a = readLine()!!.toDouble()
  val area = String.format("%.4f", (pi*a*a))
  println("A="+area)
}