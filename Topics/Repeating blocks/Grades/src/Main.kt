fun main() {
    val students = readln().toInt()
    var gradeA = 0
    var gradeB = 0
    var gradeC = 0
    var gradeD = 0
    repeat(students) {
        val grade = readln().toInt()
        if (grade == 5) gradeA++
        if (grade == 4) gradeB++
        if (grade == 3) gradeC++
        if (grade == 2) gradeD++
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}