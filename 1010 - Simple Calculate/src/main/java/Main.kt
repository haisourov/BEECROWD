import java.util.*

fun main(args: Array<String>) {
  val (C1, N1, P1) = readLine()!!.split(" ").map{it.toDouble()}
  val (C2, N2, P2) = readLine()!!.split(" ").map{it.toDouble()}
  val PRICE = String.format("%.2f", N1 * P1 + N2 * P2) 
  println("VALOR A PAGAR: R$ $PRICE")
}