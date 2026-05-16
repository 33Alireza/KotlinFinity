package beyond.sessionSix

fun main() {

    sumNumbers(3, 4)

    val averageResult = averageNumbers(9, 7)
    println(averageResult)

}

fun sumNumbers(numberOne: Int, numberTwo: Int) {
    println(numberOne + numberTwo)
}

fun averageNumbers(numberOne: Int, numberTwo: Int): Int {
    return (numberOne + numberTwo) / 2
}