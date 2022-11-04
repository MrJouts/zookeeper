fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var max = 0

    if (a >= b) max = a
    if (b >= a) max = b
    println(max)
}