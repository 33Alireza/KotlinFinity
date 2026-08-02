package beyond.sessionTwentyTwo

fun showInfo() {
    println("Kotlin")
}

fun showInfo(number: Int) {
    println(number)
}

fun showInfo(numberOne: Int, numberTwo: Int) {
    println(numberOne + numberTwo)
}

fun main() {
    showInfo()

    showInfo(7)

    showInfo(3, 4)
}