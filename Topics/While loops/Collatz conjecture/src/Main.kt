fun main() {
    var number = readln().toInt()

    while (number != 1) {
        println(number)
        if (number % 2 == 0) {
            number = number / 2
        } else {
            number = number * 3 + 1
        }
    }
    println(number)
}