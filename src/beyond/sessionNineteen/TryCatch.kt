package beyond.sessionNineteen

fun main() {
    var number = 4
    try {
        println(number / 0)
    } catch (e: Exception) {
        println(e.message)
    }

    number = try {
        number / 0
    } catch (_: Exception) {
        number
    }
    println(number)

    val list = listOf(1, 2, 3, 4, 5)
    try {
        println(list[7])
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This block runs anyway")
    }
}