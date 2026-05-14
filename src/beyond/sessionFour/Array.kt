package beyond.sessionFour

fun main() {

    val exampleArray = arrayOf("Kotlin", 2026, listOf(2, 4, 6))

    for (a in exampleArray) {
        print("$a ")
    }

    println()

    exampleArray.reverse()
    for (a in exampleArray) {
        print("$a ")
    }

    println()

    exampleArray.reverse()
    println(exampleArray[0])
    println(exampleArray.last())

    val nestedArray = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf("Kotlin", "JavaScript", "Swift"),
    )

    for (i in nestedArray) {
        for (j in i) {
            print("$j ")
        }
    }

}