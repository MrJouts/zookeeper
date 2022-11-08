fun main() {
    val input = readln().toInt()
    var i = 1
    while (i * i <= input) {
        println(i * i)
        i++
    }
}