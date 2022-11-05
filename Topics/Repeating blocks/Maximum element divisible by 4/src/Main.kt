fun main() {
    val sequence = readln().toInt()
    var max = 0
    repeat(sequence) {
        val number = readln().toInt()
        if (number % 4 == 0 && number >= max) {
            max = number
        }
    }
    println(max)
}