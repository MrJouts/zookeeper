fun main() {
    val i = readln().toInt()
    println(if (i > -15 && i <= 12 || i > 14 && i < 17 || i >= 19) "True" else "False")
}