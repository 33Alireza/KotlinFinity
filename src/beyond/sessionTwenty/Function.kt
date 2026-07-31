package beyond.sessionTwenty

fun main() {
    showName()

    showResult(numberTwo = 3, numberOne = 4)

    val result = returnResult(6, 9)
    println(result)
}

fun showName() {
    println("Kotlin")
}

fun showResult(numberOne: Int, numberTwo: Int) {
    println(numberOne + numberTwo)
}

fun returnResult(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo
}