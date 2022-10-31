fun main() {
    val number = readln().toInt()

    val d1 = number / 100
    val d2 = number / 10 % 10
    val d3 = number % 10

    val stringNumber = d3.toString() + d2.toString() + d1.toString()

    println(stringNumber.toInt())
}