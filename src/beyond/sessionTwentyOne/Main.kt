package beyond.sessionTwentyOne

class User(var id: Int, val email: String) {
    fun printInfo() {
        println("$id: $email")
    }
}

fun main() {
    val firstUser = User(1, "example@gmail.com")
    println("${firstUser.id} -> ${firstUser.email}")

    firstUser.id = 3

    val secondUser = User(2, "jane@gmail.com")
    secondUser.printInfo()
}