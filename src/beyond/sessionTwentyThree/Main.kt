package beyond.sessionTwentyThree

enum class Days {
    SATURDAY,
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
}

fun main() {
    val today = Days.MONDAY
    println(today)

    for (day in Days.entries) {
        println("${day.ordinal} -> ${day.name}")
    }
}