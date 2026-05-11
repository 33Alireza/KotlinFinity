package infinity.basics.operators

fun main() {

    var numberOne = 12
    var numberTwo = 6

    println(numberOne + numberTwo)
    println(numberOne * numberTwo)
    println(numberOne / numberTwo)
    println(numberOne % numberTwo)
    println(numberOne - numberTwo)

    println()

    numberOne += 3
    println(numberOne)
    numberTwo -= 2
    println(numberTwo)
    numberOne *= 2
    println(numberOne)
    numberTwo /= 2
    println(numberTwo)

    println()
    
    println(numberOne == numberTwo)
    println(numberOne != numberTwo)
    println(numberOne > numberTwo)
    println(numberOne >= numberTwo)

    println()

    numberOne++
    println(numberOne)
    numberTwo--
    println(numberTwo)

    println()

    val areBothEven = numberOne % 2 == 0 && numberTwo % 2 == 0
    println(areBothEven)
    val isOneEven = numberOne % 2 == 0 || numberTwo % 2 == 1
    println(isOneEven)
    println(numberOne % 2 == 0 || numberTwo % 2 == 1 && numberOne + numberTwo == 32)

}