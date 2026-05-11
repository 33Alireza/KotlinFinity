package infinity.objectOrientedProgramming.introduceOOP

import infinity.objectOrientedProgramming.introduceOOP.profile.Human

fun main() {

    val human = Human()

    human.name = "Kotlin"
    human.family = "Jetbrains"

    println("${human.name} ${human.family}")

    human.showMyAge(25)

}