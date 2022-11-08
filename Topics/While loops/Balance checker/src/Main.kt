import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var message = ""
    while (scanner.hasNextInt()) {
        val n = scanner.nextInt()

        if (balance < n) {
            message = "Error, insufficient funds for the purchase. Your balance is $balance, but you need $n."
        } else {
            balance -= n
            message = "Thank you for choosing us to manage your account! Your balance is $balance."
        }
    }
    println(message)
}