import kotlin.math.*

fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    val vertical = x1 == x2
    val horizontal = y1 == y2
    val diagonal = abs(x1 - x2) == abs(y1 - y2)

    println(if (vertical || horizontal || diagonal) "YES" else "NO")
}