package beyond.sessionFive

fun main() {

    val languageName = "Kotlin"
    val numberOne = 8

    try {
        println(languageName.toInt())
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println(languageName)
    }

    val divisionOperation = try {
        numberOne / 0
    } catch (_: Exception) {
        numberOne * 2
    }

    println(divisionOperation)

}