fun main() {
    val studentsInClass1 = readln().toInt()
    val studentsInClass2 = readln().toInt()
    val studentsInClass3 = readln().toInt()

    val desksInClass1 = studentsInClass1 / 2 + studentsInClass1 % 2
    val desksInClass2 = studentsInClass2 / 2 + studentsInClass2 % 2
    val desksInClass3 = studentsInClass3 / 2 + studentsInClass3 % 2

    val totalDesks = desksInClass1 + desksInClass2 + desksInClass3

    println(totalDesks)
}