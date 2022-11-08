import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var index = 0
    var count = 0
    var max = Int.MIN_VALUE

    do {
        index++
        val n = scanner.nextInt()

        if (n > max) {
            max = n
            count = index
        }

    } while (scanner.hasNextInt())

    println("$max $count")
}