fun main() {
    val input = readln().toInt()
    var count = 0
    var numbers = 0

    while (numbers <= input) {
        repeat(count) {
            if (numbers < input) {
                print("$count ")
            }
            numbers++
        }
        count++
    }
}