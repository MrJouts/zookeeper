fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val hours = (totalSeconds / 3600) % 24
    val minutes = (totalSeconds % 3600) / 60
    val seconds = (totalSeconds % 3600) % 60
    println("$hours:$minutes:$seconds")
}