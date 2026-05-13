package beyond.sessionThree

fun main() {

    val numberOne = 8
    val numberTwo = 9

    when (numberOne) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Unknown")
    }

    when (numberOne) {
        1, 2 -> println("One, Two")
        3, 4 -> println("Three, Four")
        else -> println("Unknown")
    }

    when (numberOne) {
        in 0..9 -> println("Single Digit")
        in 10..99 -> println("Double Digit")
        else -> println("Unknown")
    }

    when (numberOne) {
        in 0..2 -> {
            println(numberOne * 2)
        }

        in 3..5 -> {
            println(numberOne * 3)
        }

        in 6..9 -> {
            if (numberOne > 99) {
                println("Unknown")
            } else {
                println(numberOne * 6)
            }
        }
    }

    when {
        numberOne % 2 == 0 && numberTwo % 2 == 0 -> println("Both numbers are even")
        numberOne % 2 == 0 || numberTwo % 2 == 0 -> println("One of the numbers are odd")
    }

    when (numberOne) {
        1 -> println("One")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}