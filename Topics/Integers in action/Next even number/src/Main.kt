fun main() {
    val number = readln().toInt()
    val evenNumber = number + (2 - number % 2)
    println(evenNumber)
}