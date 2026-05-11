package infinity.exceptionHandling.tryAsExpression

fun main() {
    val result: Int = try {
        "123".toInt()
    } catch (e: Exception){
        -1
    }

    println("Result: $result")
}