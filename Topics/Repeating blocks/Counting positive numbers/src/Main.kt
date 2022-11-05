fun main() {
    val sequence = readln().toInt()
    var countPositiveNumbers = 0
    repeat(sequence) {
        val number = readln().toInt()
        if (number > 0) countPositiveNumbers++
    }
    println(countPositiveNumbers)
}