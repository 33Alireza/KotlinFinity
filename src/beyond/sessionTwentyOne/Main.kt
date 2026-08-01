package beyond.sessionTwentyOne

class User {
    val name: String = "Alireza"
    val lang: String = "Kotlin"

    fun showMessage() {
        println("$name loves $lang")
    }
}

fun main() {
    val user = User()
    user.showMessage()
}