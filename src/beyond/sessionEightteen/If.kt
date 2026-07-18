package beyond.sessionEightteen

fun main() {
    val numberOne = 3
    val numberTwo = 4

    if (numberOne > numberTwo) {
        println("$numberOne is bigger")
    } else {
        println("$numberTwo is bigger")
    }

    val biggestNumber = if (numberOne > numberTwo) {
        numberOne
    } else {
        numberTwo
    }
    println(biggestNumber)

    if (numberTwo % 2 == 0) println("Even") else println("Odd")

    if (numberTwo == 0) {
        println("Zero")
    } else if (numberTwo == 1) {
        println("One")
    } else if (numberTwo == 2) {
        println("Two")
    }
}