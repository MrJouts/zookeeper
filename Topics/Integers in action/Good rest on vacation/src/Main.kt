fun main() {
    val days = readln().toInt()
    val totalFoodPerDay = readln().toInt()
    val onWayFlight = readln().toInt()
    val oneNinghtInAHotel = readln().toInt()

    val totalFood = days * totalFoodPerDay
    val totalFlight = 2 * onWayFlight
    val totalHotel = (days - 1) * oneNinghtInAHotel

    println(totalFood + totalFlight + totalHotel)
}