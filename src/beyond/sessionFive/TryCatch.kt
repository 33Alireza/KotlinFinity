package beyond.sessionFive

fun main() {

    val languageName = "Kotlin"

    try {
        println(languageName.toInt())
    } catch (e: Exception) {
        println(e.message)
    }

}