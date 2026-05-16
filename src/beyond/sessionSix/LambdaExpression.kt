package beyond.sessionSix

fun main() {

    val sumNumbers = {
            numberOne: Int,
            numberTwo: Int,
        ->
        numberOne + numberTwo
    }

    println(sumNumbers(3, 4))

    val numbersList = listOf(-3, -2, -1, 1, 2, 3)
    val positiveNumbersList = numbersList.filter { it > 0 }
    val negativeNumbersList = numbersList.filter { it < 0 }

    println(positiveNumbersList)
    println(negativeNumbersList)

    val doubledNumbersList = numbersList.map { it * 2 }
    val tripledNumbersList = numbersList.map { it * 3 }

    println(doubledNumbersList)
    println(tripledNumbersList)

}