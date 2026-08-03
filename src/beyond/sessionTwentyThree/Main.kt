package beyond.sessionTwentyThree

data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val email: String,
)

fun main() {
    val firstUser = User(1, "Alireza", 19, "alireza@gmail.com")
    println("${firstUser.id} ${firstUser.name} ${firstUser.age} ${firstUser.email}")
    println(firstUser.name)

    val secondUser = User(2, "Hussein", 26, "hussein@gmail.com")
    println(secondUser)
}