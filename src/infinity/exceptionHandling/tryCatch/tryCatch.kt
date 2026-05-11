package infinity.exceptionHandling.tryCatch

fun main() {
    try {
        val number = "Kotlin".toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("Error : ${e.message}")
    }
}