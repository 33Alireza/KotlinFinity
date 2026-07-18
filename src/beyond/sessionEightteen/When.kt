package beyond.sessionEightteen

fun main() {
    val numberOne = 4
    val numberTwo = 4

    when (numberOne) {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Unknown")
    }

    when {
        numberOne > numberTwo -> println("$numberOne is bigger")
        numberOne < numberTwo -> println("$numberOne is smaller")
        numberOne == numberTwo -> println("$numberOne is equal")
        else -> println("Unknown")
    }

    when (numberTwo) {
        0, 1 -> println("Zero, One")
        2, 3 -> println("Two, Three")
        else -> println("Unknown")
    }

    when (numberOne) {
        in 0..10 -> println("$numberOne is smaller than 10")
        in 11..20 -> println("$numberOne is smaller than 20")
        else -> println("Unknown")
    }

}