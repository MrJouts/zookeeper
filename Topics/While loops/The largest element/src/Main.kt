fun main() {
    var max = 0
    do {
        val number = readln().toInt()
        if (number >= max) {
            max = number
        }
    } while (number != 0)

    println(max)
}