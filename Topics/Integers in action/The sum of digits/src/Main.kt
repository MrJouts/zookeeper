fun main() {
    val number = readln().toInt()

    val d1 = number / 100
    val d2 = number / 10 % 10
    val d3 = number % 10

    println(d1 + d2 + d3)
}