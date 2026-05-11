package infinity.exceptionHandling.tryCatchFinally

fun main() {
    try {
        val numbers = listOf(1,2,3)
        println(numbers[5])
    } catch (e: Exception) {
        println("Caught: ${e.message}")
    } finally {
        println("This block always runs 🚀")
    }
}