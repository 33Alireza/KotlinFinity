package infinity.objectOrientedProgramming.dataClass

fun main() {

    val firstUser = User("John", 1)
    println(firstUser)

    println()

    val secondUser = User("Chris", 1)
    val thirdUser = User("Denis", 2)

    println("${firstUser.name} == ${secondUser.name}: ${firstUser == secondUser}")
    println("${firstUser.name} == ${thirdUser.name}: ${firstUser == thirdUser}")

    println()

    println(firstUser.copy(name = "Martin"))
    println(firstUser.copy(id = 3))

    println()

    val forthUser = User("John", 1)
    println(firstUser == forthUser)


}