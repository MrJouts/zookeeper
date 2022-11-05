fun main() {
    val parts = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(parts) {
        val part = readln().toInt()
        if (part == 1) larger++
        if (part == -1) smaller++
        if (part == 0) perfect++
    }
    println("$perfect $larger $smaller")
}