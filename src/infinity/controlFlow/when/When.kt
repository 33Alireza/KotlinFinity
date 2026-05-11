package infinity.controlFlow.`when`

fun main() {

    val x = 8

    when (x) {
        1 -> println("Number is 1")
        2 -> println("Number is 2")
        3 -> println("Number is 3")
        4 -> {
            x == 5
            println("Number is $x")
        }

        else -> println("Number isn't valid")
    }

    println()

    when (x) {
        1, 2 -> println("Number is 1,2")
        3, 4 -> println("Number is 3,4")
        5 -> println("Number is 5")
        else -> println("Number isn't valid")
    }

    println()

    when (x) {
        in 1..6 -> println("Number is 1..6")
        in 7..10 -> println("Number is 7..10")
        else -> println("Number isn't valid")
    }

    println()

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}