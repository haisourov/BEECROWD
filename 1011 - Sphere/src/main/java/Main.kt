fun main(args: Array<String>) {
	val r = readLine()!!.toDouble()
    val pi = 3.14159
    val V = String.format("%.3f", 4.0 * pi * r * r * r/3.0)
    println("VOLUME = $V")
}
