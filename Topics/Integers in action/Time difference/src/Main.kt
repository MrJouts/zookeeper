fun main() {
    val h1 = readln().toInt()
    val m1 = readln().toInt()
    val s1 = readln().toInt()
    val h2 = readln().toInt()
    val m2 = readln().toInt()
    val s2 = readln().toInt()

    val time1InSeconds = h1 * 60 * 60 + m1 * 60 + s1
    val time2InSeconds = h2 * 60 * 60 + m2 * 60 + s2

    println(time2InSeconds - time1InSeconds)

}