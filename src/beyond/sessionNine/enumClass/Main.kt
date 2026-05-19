package beyond.sessionNine.enumClass

fun main() {

    println(DaysEnumClass.TUESDAY)

    for (day in DaysEnumClass.entries) {
        println("${day.ordinal} -> ${day.name}")
    }

}