package beyond.sessionEightteen

fun main() {
    var numberOne = 4
    val numberTwo = 3

    println(numberOne + numberTwo)
    println(numberOne - numberTwo)
    println(numberOne * numberTwo)
    println(numberOne / numberTwo)
    println(numberOne % numberTwo)

    println(numberOne == numberTwo)
    println(numberOne != numberTwo)
    println(numberOne > numberTwo)
    println(numberOne >= numberTwo)

    numberOne += numberTwo
    println(numberOne)
    numberOne -= numberTwo
    println(numberOne)
    numberOne /= numberTwo
    println(numberOne)
    numberOne *= numberTwo
    println(numberOne)

    numberOne++
    println(numberOne)
    numberOne--
    println(numberOne)

    val areBothEven = numberOne % 2 == 0 && numberTwo % 2 == 0
    println(areBothEven)
    val isOneEven = numberOne % 2 == 0 || numberTwo % 2 == 0
    println(isOneEven)
    println(numberOne % 2 == 0 || numberTwo % 2 == 0 && numberOne + numberTwo == 7)
}