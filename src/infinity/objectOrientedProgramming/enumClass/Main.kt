package infinity.objectOrientedProgramming.enumClass

fun main() {

    println(Days.SATURDAY)

    println()

    for (day in Days.entries) {
        println("${day.ordinal} = ${day.name}")
    }

    println()

    val profile = Profile(Users.KOTLIN)
    profile.showUserFamily()

    println()

    println("${Users.KOTLIN}'s id is ${Users.KOTLIN.userId}")
}