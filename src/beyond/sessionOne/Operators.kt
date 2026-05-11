package beyond.sessionOne

fun main() {
    // operators help you do mathematics calculations wherever you need them

    var numberOne = 9
    var numberTwo = 4

    // here are example of must common operators

    println(numberOne + numberTwo)
    println(numberOne - numberTwo)
    println(numberOne * numberTwo)
    println(numberOne / numberTwo)
    println(numberOne % numberTwo)

    println()

    numberOne += 3
    println(numberOne)
    numberTwo -= 3
    println(numberTwo)
    numberOne *= 6
    println(numberOne)
    numberOne /= 2
    println(numberOne)

    println()

    println(numberOne == numberTwo)
    println(numberOne != numberTwo)
    println(numberOne < numberTwo)
    println(numberOne >= numberTwo)

    println()

    val areBothEven = numberOne % 2 == 0 && numberTwo % 2 == 0
    println(areBothEven)
    val isOneEven = numberOne % 2 == 0 || numberTwo % 2 == 1
    println(isOneEven)
}