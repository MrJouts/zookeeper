fun main() {
    val peanutButterCups = readln().toInt()
    val isWeekend = readln().toBoolean()

    println((peanutButterCups >= 10 && peanutButterCups <= 20 && !isWeekend) || (peanutButterCups >= 15 && peanutButterCups <= 25 && isWeekend))
}